package br.com.carstore;

import br.com.carstore.dao.CarDAO;
import br.com.carstore.model.Car;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/create-car")
public class CreateCarServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Car car = new Car();


        String carName = request.getParameter("carName");

        car.setName(carName);

        CarDAO dao = new CarDAO();

        dao.createCar(car);

        request.getRequestDispatcher("index.html").forward(request, response);

    }

}
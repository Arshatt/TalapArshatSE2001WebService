package repositories.interfaces;

import entities.Medicine;

import java.util.ArrayList;

public interface IMedicineRepository {
    ArrayList<Medicine> listMedicineByName(String name);
    Medicine getMedicineById(int id);
    boolean addMedicine(Medicine medicine);
    boolean deleteMedicineById(int id);
}

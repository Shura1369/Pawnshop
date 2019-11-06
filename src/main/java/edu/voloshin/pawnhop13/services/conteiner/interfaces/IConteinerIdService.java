package edu.voloshin.pawnhop13.services.conteiner.interfaces;

import edu.voloshin.pawnhop13.models.ConteinerId;
import edu.voloshin.pawnhop13.models.TypeId;

public interface IConteinerIdService {
    ConteinerId getContIdService();
    void setContIdService(TypeId typeId, String id);
    void clearContIdService();


}

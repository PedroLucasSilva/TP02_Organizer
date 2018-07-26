package br.cefetmg.inf.organizer.model.dao;

import br.cefetmg.inf.organizer.model.domain.Tag;
import br.cefetmg.inf.organizer.model.domain.User;
import java.util.List;

public interface ITagDAO {

    boolean createTag(Tag tag);

    boolean updateTag(Tag tag);

    boolean deleteTag(Tag tag);

    List<Tag> listAlltag(User user);
}

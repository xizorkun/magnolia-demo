package com.crescendocollective.recipes;

import java.util.List;

import javax.jcr.Node;
import javax.jcr.RepositoryException;
import javax.jcr.Session;

import info.magnolia.context.MgnlContext;
import info.magnolia.repository.RepositoryConstants;

public class RecipePagesBuilder {
	
	public void buildpage(){
		
		Session session = null;
		try {
			session = MgnlContext.getJCRSession(RepositoryConstants.WEBSITE);
			//session.getNodeByIdentifier("recipes");
			Node foundNode = session.getNode("/recipes");
			//JcrUtils.
			System.out.println(foundNode.getName());
			foundNode.addNode("recipe");
			System.out.println(getRecipeData().size());
			session.save();
		} catch (RepositoryException e) {
			// TODO Auto-generated catch block
			session.logout();
			e.printStackTrace();
		}finally{
			session.logout();
		}
	}
	
	private List<Recipe> getRecipeData(){
		RecipeClient client = new RecipeClient();
		List<Recipe> recipeList = client.getRecipes();
		return recipeList;
	}

}

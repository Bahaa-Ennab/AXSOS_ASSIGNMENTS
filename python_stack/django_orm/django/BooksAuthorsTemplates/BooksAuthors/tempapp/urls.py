from django.urls import path
from . import views

urlpatterns = [
    path('', views.index),
    path('add_book', views.add_book),
    path('add_author', views.add_author),
    path('delete_book', views.delete_book),
    path('autour_index', views.author_index),
    path('display_book_details/<int:bookid>', views.display_book_details),
    path('add_author_to_book/<int:bookid>', views.add_author_to_book),
    path('add_book_to_author/<int:authorid>', views.add_book_to_author),
    path('display_author_details/<int:authorid>', views.display_author_details),
    
]
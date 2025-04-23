from django.urls import path
from . import views

urlpatterns = [
    path('', views.index),
    path('shows', views.all_shows),
    path('add_new_show_display', views.add_new_show_display),
    path('add_new_show', views.add_new_show),
    path('show_display/<int:showid>', views.show_display),
    path('show_edit_display/<int:showid>', views.show_edit_display),
    path('edit_show/<int:showid>', views.edit_show),
    path('show_delete/<int:showid>', views.show_delete),
    
    
]
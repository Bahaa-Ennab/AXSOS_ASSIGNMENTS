# Generated by Django 4.2.20 on 2025-04-15 13:35

from django.db import migrations, models
import django.db.models.deletion


class Migration(migrations.Migration):

    dependencies = [
        ('dojo_ninjas_app', '0001_initial'),
    ]

    operations = [
        migrations.AlterField(
            model_name='ninja',
            name='dojo_id',
            field=models.ForeignKey(on_delete=django.db.models.deletion.DO_NOTHING, related_name='dojo', to='dojo_ninjas_app.dojo'),
        ),
    ]

package defpackage;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.ViewModelInitializer;
import androidx.lifecycle.viewmodel.internal.ViewModelProviders;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class to1 {
    static {
        ViewModelProvider.Factory.Companion companion = ViewModelProvider.Factory.INSTANCE;
    }

    public static ViewModel a(ViewModelProvider.Factory factory, Class modelClass) {
        Intrinsics.i(modelClass, "modelClass");
        return ViewModelProviders.INSTANCE.unsupportedCreateViewModel$lifecycle_viewmodel_release();
    }

    public static ViewModel b(ViewModelProvider.Factory factory, Class modelClass, CreationExtras extras) {
        Intrinsics.i(modelClass, "modelClass");
        Intrinsics.i(extras, "extras");
        return factory.create(modelClass);
    }

    public static ViewModel c(ViewModelProvider.Factory factory, KClass modelClass, CreationExtras extras) {
        Intrinsics.i(modelClass, "modelClass");
        Intrinsics.i(extras, "extras");
        return factory.create(JvmClassMappingKt.a(modelClass), extras);
    }

    public static ViewModelProvider.Factory d(ViewModelInitializer... viewModelInitializerArr) {
        return ViewModelProvider.Factory.INSTANCE.from(viewModelInitializerArr);
    }
}

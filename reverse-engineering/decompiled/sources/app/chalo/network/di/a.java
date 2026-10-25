package app.chalo.network.di;

import androidx.datastore.migrations.SharedPreferencesMigration;
import androidx.datastore.preferences.core.PreferenceDataStoreFactory;
import defpackage.m4;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Scope single = (Scope) obj;
        ParametersHolder it = (ParametersHolder) obj2;
        Intrinsics.i(single, "$this$single");
        Intrinsics.i(it, "it");
        return PreferenceDataStoreFactory.createWithPath$default(PreferenceDataStoreFactory.INSTANCE, null, CollectionsKt.R(new SharedPreferencesMigration(ModuleExtKt.a(single), "network_config", null, null, new AndroidNetworkModuleKt$getSharedNetworkPlatformModule$1$1$1(3, null), 12, null)), null, new m4(single, 0), 5, null);
    }
}

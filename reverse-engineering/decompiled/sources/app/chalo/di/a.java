package app.chalo.di;

import androidx.datastore.migrations.SharedPreferencesMigration;
import androidx.datastore.preferences.core.PreferenceDataStoreFactory;
import app.chalo.contract.BasicInfoContract;
import app.chalo.location.LastKnownLocationProvider;
import app.chalo.location.LastKnownLocationStorage;
import app.chalo.providers.CoroutineContextProvider;
import defpackage.i71;
import defpackage.m4;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2480a;

    public /* synthetic */ a(int i) {
        this.f2480a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Scope single = (Scope) obj;
        ParametersHolder it = (ParametersHolder) obj2;
        switch (this.f2480a) {
            case 0:
                return new LastKnownLocationProvider((LastKnownLocationStorage) single.d(Reflection.a(LastKnownLocationStorage.class), null, null), ((CoroutineContextProvider) single.d(i71.k(single, "$this$single", it, "it", CoroutineContextProvider.class), null, null)).b(), new SharedBaseModuleKt$commonModule$1$3$1(1, (BasicInfoContract) single.d(Reflection.a(BasicInfoContract.class), null, null), BasicInfoContract.class, "getTrueTimeBlocking", "getTrueTimeBlocking()J", 4));
            default:
                Intrinsics.i(single, "$this$single");
                Intrinsics.i(it, "it");
                return PreferenceDataStoreFactory.createWithPath$default(PreferenceDataStoreFactory.INSTANCE, null, CollectionsKt.R(new SharedPreferencesMigration(ModuleExtKt.a(single), "ad_last_known_location_prefs", ArraysKt.j0(new String[]{"ts", "lat", "lon"}), null, new SharedBaseModule_androidKt$platformModule$1$11$1(3, null), 8, null)), null, new m4(single, 16), 5, null);
        }
    }
}

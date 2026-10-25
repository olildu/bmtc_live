package app.chalo.di;

import androidx.datastore.migrations.SharedPreferencesView;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesFactory;
import app.chalo.location.DataStoreLastKnownLocationStorage;
import app.chalo.utils.chalologger.ChaloLog;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Landroidx/datastore/preferences/core/Preferences;", "prefsView", "Landroidx/datastore/migrations/SharedPreferencesView;", "<unused var>"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.di.SharedBaseModule_androidKt$platformModule$1$11$1", f = "SharedBaseModule.android.kt", l = {}, m = "invokeSuspend", v = 1)
final class SharedBaseModule_androidKt$platformModule$1$11$1 extends SuspendLambda implements Function3<SharedPreferencesView, Preferences, Continuation<? super Preferences>, Object> {
    /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SharedBaseModule_androidKt$platformModule$1$11$1 sharedBaseModule_androidKt$platformModule$1$11$1 = new SharedBaseModule_androidKt$platformModule$1$11$1(3, (Continuation) obj3);
        sharedBaseModule_androidKt$platformModule$1$11$1.L$0 = (SharedPreferencesView) obj;
        return sharedBaseModule_androidKt$platformModule$1$11$1.invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        SharedPreferencesView sharedPreferencesView = (SharedPreferencesView) this.L$0;
        long j = sharedPreferencesView.getLong("ts", 0L);
        String string = sharedPreferencesView.getString("lat", null);
        Double dM0 = string != null ? StringsKt.m0(string) : null;
        String string2 = sharedPreferencesView.getString("lon", null);
        Double dM1 = string2 != null ? StringsKt.m0(string2) : null;
        boolean z = (j == 0 && dM0 == null && dM1 == null) ? false : true;
        MutablePreferences mutablePreferencesCreateMutable = PreferencesFactory.createMutable(new Preferences.Pair[0]);
        if (j <= 0 || dM0 == null || dM1 == null) {
            if (z) {
                ChaloLog.c("LegacyLastKnownLocationMigration", "Skipping partial SharedPreferences snapshot during migration", null);
            }
            return mutablePreferencesCreateMutable;
        }
        mutablePreferencesCreateMutable.set(DataStoreLastKnownLocationStorage.c, new Long(j));
        mutablePreferencesCreateMutable.set(DataStoreLastKnownLocationStorage.d, dM0);
        mutablePreferencesCreateMutable.set(DataStoreLastKnownLocationStorage.e, dM1);
        return mutablePreferencesCreateMutable;
    }
}

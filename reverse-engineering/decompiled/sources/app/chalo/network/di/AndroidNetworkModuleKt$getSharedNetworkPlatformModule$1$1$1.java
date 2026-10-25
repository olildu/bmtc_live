package app.chalo.network.di;

import androidx.datastore.migrations.SharedPreferencesView;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import app.chalo.network.config.NetworkConfig;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Landroidx/datastore/preferences/core/Preferences;", "prefsView", "Landroidx/datastore/migrations/SharedPreferencesView;", "preferences"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.network.di.AndroidNetworkModuleKt$getSharedNetworkPlatformModule$1$1$1", f = "AndroidNetworkModule.kt", l = {}, m = "invokeSuspend", v = 1)
final class AndroidNetworkModuleKt$getSharedNetworkPlatformModule$1$1$1 extends SuspendLambda implements Function3<SharedPreferencesView, Preferences, Continuation<? super Preferences>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AndroidNetworkModuleKt$getSharedNetworkPlatformModule$1$1$1 androidNetworkModuleKt$getSharedNetworkPlatformModule$1$1$1 = new AndroidNetworkModuleKt$getSharedNetworkPlatformModule$1$1$1(3, (Continuation) obj3);
        androidNetworkModuleKt$getSharedNetworkPlatformModule$1$1$1.L$0 = (SharedPreferencesView) obj;
        androidNetworkModuleKt$getSharedNetworkPlatformModule$1$1$1.L$1 = (Preferences) obj2;
        return androidNetworkModuleKt$getSharedNetworkPlatformModule$1$1$1.invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        SharedPreferencesView sharedPreferencesView = (SharedPreferencesView) this.L$0;
        MutablePreferences mutablePreferences = ((Preferences) this.L$1).toMutablePreferences();
        int i = sharedPreferencesView.getInt("connect_timeout", -1);
        int i2 = sharedPreferencesView.getInt("write_timeout", -1);
        int i3 = sharedPreferencesView.getInt("read_timeout", -1);
        long j = sharedPreferencesView.getLong("keep_alive", -1L);
        if (i != -1) {
            mutablePreferences.set(NetworkConfig.b, Integer.valueOf(i));
        }
        if (i2 != -1) {
            mutablePreferences.set(NetworkConfig.d, Integer.valueOf(i2));
        }
        if (i3 != -1) {
            mutablePreferences.set(NetworkConfig.c, Integer.valueOf(i3));
        }
        if (j != -1) {
            mutablePreferences.set(NetworkConfig.e, Long.valueOf(j));
        }
        return mutablePreferences;
    }
}

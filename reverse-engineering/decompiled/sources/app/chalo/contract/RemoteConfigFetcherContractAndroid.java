package app.chalo.contract;

import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.network.config.ChaloJson;
import app.chalo.providers.CoroutineContextProvider;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import defpackage.os0;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.ClassReference;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.internal.Platform_commonKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/contract/RemoteConfigFetcherContractAndroid;", "Lapp/chalo/contract/RemoteConfigFetcherContract;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RemoteConfigFetcherContractAndroid implements RemoteConfigFetcherContract {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FirebaseRemoteConfig f1951a;
    public final CrashlyticsLogger b;
    public final CoroutineContextProvider c;
    public final ContextScope d;
    public final MutableStateFlow e = StateFlowKt.a(EmptySet.f17559a);

    public RemoteConfigFetcherContractAndroid(FirebaseRemoteConfig firebaseRemoteConfig, CrashlyticsLogger crashlyticsLogger, CoroutineContextProvider coroutineContextProvider) {
        this.f1951a = firebaseRemoteConfig;
        this.b = crashlyticsLogger;
        this.c = coroutineContextProvider;
        this.d = CoroutineScopeKt.a(coroutineContextProvider.b());
        try {
            Intrinsics.f(firebaseRemoteConfig.fetchAndActivate().addOnSuccessListener(new os0(new a(this), 9)).addOnFailureListener(new os0(this, 10)));
        } catch (Exception e) {
            e.printStackTrace();
            this.b.i(e.getCause());
        }
    }

    @Override // app.chalo.contract.RemoteConfigFetcherContract
    public final Object a(String str, ClassReference classReference, Object defaultValue) {
        Intrinsics.i(defaultValue, "defaultValue");
        String strAsString = this.f1951a.getValue(str).asString();
        Intrinsics.h(strAsString, "asString(...)");
        String message = "remoteConfigValueAsString for " + str + ": " + strAsString;
        Intrinsics.i(message, "message");
        try {
            KSerializer kSerializerC = SerializersKt.c(classReference);
            Object objB = null;
            if (kSerializerC == null) {
                Platform_commonKt.d(classReference);
                throw null;
            }
            try {
                objB = ChaloJson.b.b(strAsString, kSerializerC);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return objB == null ? defaultValue : objB;
        } catch (SerializationException e2) {
            e2.printStackTrace();
            return defaultValue;
        }
    }
}

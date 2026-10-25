package app.chalo.security.root;

import app.chalo.contract.BasicInfoContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.features.chaloconfig.ChaloConfigFeature;
import app.chalo.network.config.ChaloJson;
import defpackage.cb0;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/security/root/GetRootCheckRemoteConfigUseCase;", "", "RootCheckRemoteConfig", "security_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetRootCheckRemoteConfigUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloConfigFeature f9372a;
    public final CrashlyticsLogger b;
    public final BasicInfoContract c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0083\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/security/root/GetRootCheckRemoteConfigUseCase$RootCheckRemoteConfig;", "", "Companion", "$serializer", "security_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class RootCheckRemoteConfig {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f9373a;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/security/root/GetRootCheckRemoteConfigUseCase$RootCheckRemoteConfig$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/security/root/GetRootCheckRemoteConfigUseCase$RootCheckRemoteConfig;", "serializer", "()Lkotlinx/serialization/KSerializer;", "security_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<RootCheckRemoteConfig> serializer() {
                return GetRootCheckRemoteConfigUseCase$RootCheckRemoteConfig$$serializer.f9374a;
            }
        }

        public /* synthetic */ RootCheckRemoteConfig(int i, boolean z) {
            if ((i & 1) == 0) {
                this.f9373a = false;
            } else {
                this.f9373a = z;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RootCheckRemoteConfig) && this.f9373a == ((RootCheckRemoteConfig) obj).f9373a;
        }

        public final int hashCode() {
            return this.f9373a ? 1231 : 1237;
        }

        public final String toString() {
            return cb0.k("RootCheckRemoteConfig(enableCheck=", ")", this.f9373a);
        }
    }

    public GetRootCheckRemoteConfigUseCase(BasicInfoContract basicInfoContract, CrashlyticsLogger crashlyticsLogger, ChaloConfigFeature chaloConfigFeature) {
        this.f9372a = chaloConfigFeature;
        this.b = crashlyticsLogger;
        this.c = basicInfoContract;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) {
        GetRootCheckRemoteConfigUseCase$invoke$1 getRootCheckRemoteConfigUseCase$invoke$1;
        boolean z;
        if (continuationImpl instanceof GetRootCheckRemoteConfigUseCase$invoke$1) {
            getRootCheckRemoteConfigUseCase$invoke$1 = (GetRootCheckRemoteConfigUseCase$invoke$1) continuationImpl;
            int i = getRootCheckRemoteConfigUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getRootCheckRemoteConfigUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getRootCheckRemoteConfigUseCase$invoke$1 = new GetRootCheckRemoteConfigUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            getRootCheckRemoteConfigUseCase$invoke$1 = new GetRootCheckRemoteConfigUseCase$invoke$1(this, continuationImpl);
        }
        Object objA = getRootCheckRemoteConfigUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getRootCheckRemoteConfigUseCase$invoke$1.label;
        CrashlyticsLogger crashlyticsLogger = this.b;
        try {
            if (i2 == 0) {
                ResultKt.b(objA);
                String str = this.c.f() ? "asicisunvmlfipqbn" : "sdipjnmmzwqlhjfe";
                ChaloConfigFeature chaloConfigFeature = this.f9372a;
                getRootCheckRemoteConfigUseCase$invoke$1.label = 1;
                objA = chaloConfigFeature.a(str, getRootCheckRemoteConfigUseCase$invoke$1);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objA);
            }
            String str2 = (String) objA;
            if (StringsKt.F(str2)) {
                return Boolean.FALSE;
            }
            try {
                Json json = ChaloJson.b;
                json.getClass();
                z = ((RootCheckRemoteConfig) json.b(str2, RootCheckRemoteConfig.INSTANCE.serializer())).f9373a;
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                crashlyticsLogger.i(e2);
                z = false;
            }
            return Boolean.valueOf(z);
        } catch (CancellationException e3) {
            throw e3;
        } catch (Exception e4) {
            crashlyticsLogger.i(e4);
            return Boolean.FALSE;
        }
    }
}

package app.chalo.mticket.domain;

import app.chalo.features.chaloconfig.ChaloConfigFeature;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/mticket/domain/FreeRideHelpUrlUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FreeRideHelpUrlUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloConfigFeature f5725a;
    public final CityProvider b;

    public FreeRideHelpUrlUseCase(ChaloConfigFeature chaloConfigFeature, CityProvider cityProvider) {
        this.f5725a = chaloConfigFeature;
        this.b = cityProvider;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) {
        FreeRideHelpUrlUseCase$invoke$1 freeRideHelpUrlUseCase$invoke$1;
        String lowerCase;
        if (continuationImpl instanceof FreeRideHelpUrlUseCase$invoke$1) {
            freeRideHelpUrlUseCase$invoke$1 = (FreeRideHelpUrlUseCase$invoke$1) continuationImpl;
            int i = freeRideHelpUrlUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                freeRideHelpUrlUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                freeRideHelpUrlUseCase$invoke$1 = new FreeRideHelpUrlUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            freeRideHelpUrlUseCase$invoke$1 = new FreeRideHelpUrlUseCase$invoke$1(this, continuationImpl);
        }
        Object objA = freeRideHelpUrlUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = freeRideHelpUrlUseCase$invoke$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            freeRideHelpUrlUseCase$invoke$1.label = 1;
            objA = this.f5725a.a("freeBusRideHelpBaseUri", freeRideHelpUrlUseCase$invoke$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        String strB = CityProviderKt.b(this.b);
        if (strB != null) {
            lowerCase = strB.toLowerCase(Locale.ROOT);
            Intrinsics.h(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = null;
        }
        return objA + lowerCase;
    }
}

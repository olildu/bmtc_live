package app.chalo.validation.superpass;

import app.chalo.extensions.JsonElementExtensionsKt;
import app.chalo.features.chaloconfig.ChaloConfigFeature;
import app.chalo.network.config.ChaloJson;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/validation/superpass/GetNumDigitsOfHashValueForEasyVerificationUseCase;", "", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetNumDigitsOfHashValueForEasyVerificationUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloConfigFeature f10458a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/validation/superpass/GetNumDigitsOfHashValueForEasyVerificationUseCase$Companion;", "", "", "DEFAULT_NUM_DIGITS_OF_HASH_VALUE", "I", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public GetNumDigitsOfHashValueForEasyVerificationUseCase(ChaloConfigFeature chaloConfigFeature) {
        this.f10458a = chaloConfigFeature;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(int i, ContinuationImpl continuationImpl) {
        GetNumDigitsOfHashValueForEasyVerificationUseCase$invoke$1 getNumDigitsOfHashValueForEasyVerificationUseCase$invoke$1;
        if (continuationImpl instanceof GetNumDigitsOfHashValueForEasyVerificationUseCase$invoke$1) {
            getNumDigitsOfHashValueForEasyVerificationUseCase$invoke$1 = (GetNumDigitsOfHashValueForEasyVerificationUseCase$invoke$1) continuationImpl;
            int i2 = getNumDigitsOfHashValueForEasyVerificationUseCase$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getNumDigitsOfHashValueForEasyVerificationUseCase$invoke$1.label = i2 - Integer.MIN_VALUE;
            } else {
                getNumDigitsOfHashValueForEasyVerificationUseCase$invoke$1 = new GetNumDigitsOfHashValueForEasyVerificationUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            getNumDigitsOfHashValueForEasyVerificationUseCase$invoke$1 = new GetNumDigitsOfHashValueForEasyVerificationUseCase$invoke$1(this, continuationImpl);
        }
        Object objA = getNumDigitsOfHashValueForEasyVerificationUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = getNumDigitsOfHashValueForEasyVerificationUseCase$invoke$1.label;
        if (i3 == 0) {
            ResultKt.b(objA);
            getNumDigitsOfHashValueForEasyVerificationUseCase$invoke$1.I$0 = i;
            getNumDigitsOfHashValueForEasyVerificationUseCase$invoke$1.label = 1;
            objA = this.f10458a.a("easyConductorVerification", getNumDigitsOfHashValueForEasyVerificationUseCase$invoke$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = getNumDigitsOfHashValueForEasyVerificationUseCase$invoke$1.I$0;
            ResultKt.b(objA);
        }
        String str = (String) objA;
        if (str.length() != 0) {
            try {
                JsonElement jsonElementF = ChaloJson.b.f(str);
                Intrinsics.i(jsonElementF, "<this>");
                i = JsonElementExtensionsKt.n(i, "numDigits", JsonElementKt.g(jsonElementF));
            } catch (Exception unused) {
            }
        }
        return new Integer(i);
    }
}

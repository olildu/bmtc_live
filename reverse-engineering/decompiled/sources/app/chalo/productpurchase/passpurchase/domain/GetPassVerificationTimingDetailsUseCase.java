package app.chalo.productpurchase.passpurchase.domain;

import androidx.media3.extractor.text.ttml.TtmlNode;
import app.chalo.features.chaloconfig.ChaloConfigFeature;
import app.chalo.network.config.ChaloJson;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.CityProviderKt;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/domain/GetPassVerificationTimingDetailsUseCase;", "", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetPassVerificationTimingDetailsUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloConfigFeature f8331a;
    public final CityProvider b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/domain/GetPassVerificationTimingDetailsUseCase$Companion;", "", "", "ALL", "Ljava/lang/String;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public GetPassVerificationTimingDetailsUseCase(ChaloConfigFeature chaloConfigFeature, CityProvider cityProvider) {
        this.f8331a = chaloConfigFeature;
        this.b = cityProvider;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) {
        GetPassVerificationTimingDetailsUseCase$invoke$1 getPassVerificationTimingDetailsUseCase$invoke$1;
        String lowerCase;
        if (continuationImpl instanceof GetPassVerificationTimingDetailsUseCase$invoke$1) {
            getPassVerificationTimingDetailsUseCase$invoke$1 = (GetPassVerificationTimingDetailsUseCase$invoke$1) continuationImpl;
            int i = getPassVerificationTimingDetailsUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getPassVerificationTimingDetailsUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getPassVerificationTimingDetailsUseCase$invoke$1 = new GetPassVerificationTimingDetailsUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            getPassVerificationTimingDetailsUseCase$invoke$1 = new GetPassVerificationTimingDetailsUseCase$invoke$1(this, continuationImpl);
        }
        Object objA = getPassVerificationTimingDetailsUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getPassVerificationTimingDetailsUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objA);
                ChaloConfigFeature chaloConfigFeature = this.f8331a;
                getPassVerificationTimingDetailsUseCase$invoke$1.label = 1;
                objA = chaloConfigFeature.a("passApplicationVerificationTimings", getPassVerificationTimingDetailsUseCase$invoke$1);
                if (objA == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objA);
            }
            String str = (String) objA;
            if (str.length() == 0) {
                return new MPassVerificationTimingDetails();
            }
            Json json = ChaloJson.b;
            json.getClass();
            Map map = (Map) json.b(str, new LinkedHashMapSerializer(StringSerializer.f18170a, MPassVerificationTimingDetails.INSTANCE.serializer()));
            String strB = CityProviderKt.b(this.b);
            if (strB != null) {
                lowerCase = strB.toLowerCase(Locale.ROOT);
                Intrinsics.h(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = TtmlNode.COMBINE_ALL;
            }
            MPassVerificationTimingDetails mPassVerificationTimingDetails = (MPassVerificationTimingDetails) map.get(lowerCase);
            if (mPassVerificationTimingDetails != null) {
                return mPassVerificationTimingDetails;
            }
            MPassVerificationTimingDetails mPassVerificationTimingDetails2 = (MPassVerificationTimingDetails) map.get(TtmlNode.COMBINE_ALL);
            return mPassVerificationTimingDetails2 == null ? new MPassVerificationTimingDetails() : mPassVerificationTimingDetails2;
        } catch (Exception unused) {
            return new MPassVerificationTimingDetails();
        }
    }
}

package app.chalo.ncmc.data.apiresponsemodel;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ncmc/data/apiresponsemodel/OpenCardInfoApiResponse;", "Lapp/chalo/ncmc/data/apiresponsemodel/CardInfoApiResponse;", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class OpenCardInfoApiResponse implements CardInfoApiResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OpenCardDetailsApiResponse f6103a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/data/apiresponsemodel/OpenCardInfoApiResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ncmc/data/apiresponsemodel/OpenCardInfoApiResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<OpenCardInfoApiResponse> serializer() {
            return OpenCardInfoApiResponse$$serializer.f6104a;
        }
    }

    public /* synthetic */ OpenCardInfoApiResponse(int i, OpenCardDetailsApiResponse openCardDetailsApiResponse) {
        if ((i & 1) == 0) {
            this.f6103a = null;
        } else {
            this.f6103a = openCardDetailsApiResponse;
        }
    }

    @Override // app.chalo.ncmc.data.apiresponsemodel.CardInfoApiResponse
    public final CardDetailsApiResponse a() {
        return this.f6103a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OpenCardInfoApiResponse) && Intrinsics.d(this.f6103a, ((OpenCardInfoApiResponse) obj).f6103a);
    }

    public final int hashCode() {
        OpenCardDetailsApiResponse openCardDetailsApiResponse = this.f6103a;
        if (openCardDetailsApiResponse == null) {
            return 0;
        }
        return openCardDetailsApiResponse.hashCode();
    }

    @Override // app.chalo.ncmc.data.apiresponsemodel.CardInfoApiResponse
    public final /* bridge */ boolean isValid() {
        return CardInfoApiResponse.DefaultImpls.a(this);
    }

    public final String toString() {
        return "OpenCardInfoApiResponse(cardDetails=" + this.f6103a + ")";
    }
}

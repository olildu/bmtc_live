package app.chalo.usecase;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/usecase/FeedbackConfigDataForCity;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class FeedbackConfigDataForCity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10167a;
    public final FeedbackConfig b;
    public final FeedbackConfig c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/usecase/FeedbackConfigDataForCity$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/usecase/FeedbackConfigDataForCity;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<FeedbackConfigDataForCity> serializer() {
            return FeedbackConfigDataForCity$$serializer.f10168a;
        }
    }

    public /* synthetic */ FeedbackConfigDataForCity(int i, String str, FeedbackConfig feedbackConfig, FeedbackConfig feedbackConfig2) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(FeedbackConfigDataForCity$$serializer.f10168a.getDescriptor(), i, 7);
            throw null;
        }
        this.f10167a = str;
        this.b = feedbackConfig;
        this.c = feedbackConfig2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedbackConfigDataForCity)) {
            return false;
        }
        FeedbackConfigDataForCity feedbackConfigDataForCity = (FeedbackConfigDataForCity) obj;
        return Intrinsics.d(this.f10167a, feedbackConfigDataForCity.f10167a) && Intrinsics.d(this.b, feedbackConfigDataForCity.b) && Intrinsics.d(this.c, feedbackConfigDataForCity.c);
    }

    public final int hashCode() {
        int iHashCode = this.f10167a.hashCode() * 31;
        FeedbackConfig feedbackConfig = this.b;
        int iHashCode2 = (iHashCode + (feedbackConfig == null ? 0 : feedbackConfig.hashCode())) * 31;
        FeedbackConfig feedbackConfig2 = this.c;
        return iHashCode2 + (feedbackConfig2 != null ? feedbackConfig2.hashCode() : 0);
    }

    public final String toString() {
        return "FeedbackConfigDataForCity(city=" + this.f10167a + ", titoRide=" + this.b + ", conductorValidation=" + this.c + ")";
    }

    public FeedbackConfigDataForCity(FeedbackConfig feedbackConfig, FeedbackConfig feedbackConfig2) {
        this.f10167a = "";
        this.b = feedbackConfig;
        this.c = feedbackConfig2;
    }
}

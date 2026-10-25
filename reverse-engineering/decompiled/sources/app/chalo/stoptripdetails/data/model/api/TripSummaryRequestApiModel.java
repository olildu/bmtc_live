package app.chalo.stoptripdetails.data.model.api;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/stoptripdetails/data/model/api/TripSummaryRequestApiModel;", "", "Companion", "$serializer", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class TripSummaryRequestApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final TripSummaryRequestApiModel b = new TripSummaryRequestApiModel(new TrimSummaryRequiredFields(null, new TripSummary()));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TrimSummaryRequiredFields f9490a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/stoptripdetails/data/model/api/TripSummaryRequestApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/stoptripdetails/data/model/api/TripSummaryRequestApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<TripSummaryRequestApiModel> serializer() {
            return TripSummaryRequestApiModel$$serializer.f9491a;
        }
    }

    public /* synthetic */ TripSummaryRequestApiModel(int i, TrimSummaryRequiredFields trimSummaryRequiredFields) {
        if (1 == (i & 1)) {
            this.f9490a = trimSummaryRequiredFields;
        } else {
            PluginExceptionsKt.b(TripSummaryRequestApiModel$$serializer.f9491a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TripSummaryRequestApiModel) && Intrinsics.d(this.f9490a, ((TripSummaryRequestApiModel) obj).f9490a);
    }

    public final int hashCode() {
        return this.f9490a.hashCode();
    }

    public final String toString() {
        return "TripSummaryRequestApiModel(requiredFields=" + this.f9490a + ")";
    }

    public TripSummaryRequestApiModel(TrimSummaryRequiredFields trimSummaryRequiredFields) {
        this.f9490a = trimSummaryRequiredFields;
    }
}

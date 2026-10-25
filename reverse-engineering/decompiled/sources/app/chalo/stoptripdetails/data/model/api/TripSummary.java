package app.chalo.stoptripdetails.data.model.api;

import defpackage.b3;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/stoptripdetails/data/model/api/TripSummary;", "", "Companion", "$serializer", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class TripSummary {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9488a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/stoptripdetails/data/model/api/TripSummary$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/stoptripdetails/data/model/api/TripSummary;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<TripSummary> serializer() {
            return TripSummary$$serializer.f9489a;
        }
    }

    public TripSummary() {
        this.f9488a = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TripSummary) && this.f9488a == ((TripSummary) obj).f9488a;
    }

    /* JADX INFO: renamed from: hashCode, reason: from getter */
    public final int getF9488a() {
        return this.f9488a;
    }

    public final String toString() {
        return b3.d(this.f9488a, "TripSummary(id=", ")");
    }

    public /* synthetic */ TripSummary(int i, int i2) {
        if (1 == (i & 1)) {
            this.f9488a = i2;
        } else {
            PluginExceptionsKt.b(TripSummary$$serializer.f9489a.getDescriptor(), i, 1);
            throw null;
        }
    }
}

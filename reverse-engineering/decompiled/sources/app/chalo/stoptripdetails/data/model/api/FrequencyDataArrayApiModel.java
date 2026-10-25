package app.chalo.stoptripdetails.data.model.api;

import defpackage.b3;
import defpackage.uf0;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/stoptripdetails/data/model/api/FrequencyDataArrayApiModel;", "", "Companion", "$serializer", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class FrequencyDataArrayApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9471a;
    public final int b;
    public final int c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/stoptripdetails/data/model/api/FrequencyDataArrayApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/stoptripdetails/data/model/api/FrequencyDataArrayApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<FrequencyDataArrayApiModel> serializer() {
            return FrequencyDataArrayApiModel$$serializer.f9472a;
        }
    }

    public /* synthetic */ FrequencyDataArrayApiModel(int i, int i2, int i3, int i4) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(FrequencyDataArrayApiModel$$serializer.f9472a.getDescriptor(), i, 7);
            throw null;
        }
        this.f9471a = i2;
        this.b = i3;
        this.c = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FrequencyDataArrayApiModel)) {
            return false;
        }
        FrequencyDataArrayApiModel frequencyDataArrayApiModel = (FrequencyDataArrayApiModel) obj;
        return this.f9471a == frequencyDataArrayApiModel.f9471a && this.b == frequencyDataArrayApiModel.b && this.c == frequencyDataArrayApiModel.c;
    }

    public final int hashCode() {
        return (((this.f9471a * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        return b3.f(")", this.c, uf0.s(this.f9471a, this.b, "FrequencyDataArrayApiModel(endTime=", ", frequency=", ", startTime="));
    }
}

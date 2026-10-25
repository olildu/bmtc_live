package app.chalo.ridefeedbacktracker;

import app.chalo.models.validation.ValidationProduct;
import defpackage.cb0;
import defpackage.ji;
import defpackage.r30;
import defpackage.t10;
import defpackage.uf0;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ridefeedbacktracker/ChaloRideFeedback;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ChaloRideFeedback {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9092a;
    public final int b;
    public final List c;
    public final String d;
    public final ValidationProduct e;
    public final long f;
    public final long g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ridefeedbacktracker/ChaloRideFeedback$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ridefeedbacktracker/ChaloRideFeedback;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ChaloRideFeedback> serializer() {
            return ChaloRideFeedback$$serializer.f9093a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        h = new Lazy[]{null, null, LazyKt.a(lazyThreadSafetyMode, new ji(27)), null, LazyKt.a(lazyThreadSafetyMode, new ji(28)), null, null};
    }

    public /* synthetic */ ChaloRideFeedback(int i, int i2, int i3, List list, String str, ValidationProduct validationProduct, long j, long j2) {
        if (127 != (i & 127)) {
            PluginExceptionsKt.b(ChaloRideFeedback$$serializer.f9093a.getDescriptor(), i, 127);
            throw null;
        }
        this.f9092a = i2;
        this.b = i3;
        this.c = list;
        this.d = str;
        this.e = validationProduct;
        this.f = j;
        this.g = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloRideFeedback)) {
            return false;
        }
        ChaloRideFeedback chaloRideFeedback = (ChaloRideFeedback) obj;
        return this.f9092a == chaloRideFeedback.f9092a && this.b == chaloRideFeedback.b && Intrinsics.d(this.c, chaloRideFeedback.c) && Intrinsics.d(this.d, chaloRideFeedback.d) && Intrinsics.d(this.e, chaloRideFeedback.e) && this.f == chaloRideFeedback.f && this.g == chaloRideFeedback.g;
    }

    public final int hashCode() {
        int iB = r30.b(((this.f9092a * 31) + this.b) * 31, 31, this.c);
        String str = this.d;
        int iHashCode = (this.e.hashCode() + ((iB + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        long j = this.f;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.g;
        return i + ((int) ((j2 >>> 32) ^ j2));
    }

    public final String toString() {
        StringBuilder sbS = uf0.s(this.f9092a, this.b, "ChaloRideFeedback(selectedRating=", ", maxRating=", ", selectedFeedbackTags=");
        cb0.s(", textFeedback=", this.d, ", validationProduct=", sbS, this.c);
        sbS.append(this.e);
        sbS.append(", punchTsInMillis=");
        sbS.append(this.f);
        return t10.g(this.g, ", feedbackSubmitTsInMillis=", ")", sbS);
    }

    public ChaloRideFeedback(int i, int i2, List selectedFeedbackTags, String str, ValidationProduct validationProduct, long j, long j2) {
        Intrinsics.i(selectedFeedbackTags, "selectedFeedbackTags");
        Intrinsics.i(validationProduct, "validationProduct");
        this.f9092a = i;
        this.b = i2;
        this.c = selectedFeedbackTags;
        this.d = str;
        this.e = validationProduct;
        this.f = j;
        this.g = j2;
    }
}

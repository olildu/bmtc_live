package app.chalo.ridefeedback.data.api;

import defpackage.dd;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.r30;
import defpackage.t10;
import defpackage.uf0;
import defpackage.x11;
import defpackage.xs;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ridefeedback/data/api/RideFeedbackRequestApiModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class RideFeedbackRequestApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] j = {null, null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new x11(23)), null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9062a;
    public final String b;
    public final String c;
    public final Integer d;
    public final String e;
    public final List f;
    public final String g;
    public final boolean h;
    public final long i;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ridefeedback/data/api/RideFeedbackRequestApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ridefeedback/data/api/RideFeedbackRequestApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<RideFeedbackRequestApiModel> serializer() {
            return RideFeedbackRequestApiModel$$serializer.f9063a;
        }
    }

    public RideFeedbackRequestApiModel(int i, String str, String str2, String str3, Integer num, String str4, List list, String str5, boolean z, long j2) {
        if (479 != (i & 479)) {
            PluginExceptionsKt.b(RideFeedbackRequestApiModel$$serializer.f9063a.getDescriptor(), i, 479);
            throw null;
        }
        this.f9062a = str;
        this.b = str2;
        this.c = str3;
        this.d = num;
        this.e = str4;
        if ((i & 32) == 0) {
            this.f = EmptyList.f17557a;
        } else {
            this.f = list;
        }
        this.g = str5;
        this.h = z;
        this.i = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RideFeedbackRequestApiModel)) {
            return false;
        }
        RideFeedbackRequestApiModel rideFeedbackRequestApiModel = (RideFeedbackRequestApiModel) obj;
        return Intrinsics.d(this.f9062a, rideFeedbackRequestApiModel.f9062a) && Intrinsics.d(this.b, rideFeedbackRequestApiModel.b) && Intrinsics.d(this.c, rideFeedbackRequestApiModel.c) && Intrinsics.d(this.d, rideFeedbackRequestApiModel.d) && Intrinsics.d(this.e, rideFeedbackRequestApiModel.e) && Intrinsics.d(this.f, rideFeedbackRequestApiModel.f) && Intrinsics.d(this.g, rideFeedbackRequestApiModel.g) && this.h == rideFeedbackRequestApiModel.h && this.i == rideFeedbackRequestApiModel.i;
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(this.f9062a.hashCode() * 31, 31, this.b), 31, this.c);
        Integer num = this.d;
        int iHashCode = (iE + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.e;
        int iB = r30.b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f);
        String str2 = this.g;
        int iHashCode2 = (((iB + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.h ? 1231 : 1237)) * 31;
        long j2 = this.i;
        return iHashCode2 + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sbE = dd.e("RideFeedbackRequestApiModel(bookingId=", this.f9062a, ", productType=", this.b, ", productSubType=");
        xs.u(this.d, this.c, ", rating=", ", feedbackTag=", sbE);
        pk0.w(this.e, ", feedbackSubtag=", ", comment=", sbE, this.f);
        t10.s(this.g, ", skipped=", ", submissionTimestamp=", sbE, this.h);
        return uf0.m(this.i, ")", sbE);
    }

    public RideFeedbackRequestApiModel(String bookingId, String productType, String productSubType, Integer num, String str, List feedbackSubtag, String str2, boolean z, long j2) {
        Intrinsics.i(bookingId, "bookingId");
        Intrinsics.i(productType, "productType");
        Intrinsics.i(productSubType, "productSubType");
        Intrinsics.i(feedbackSubtag, "feedbackSubtag");
        this.f9062a = bookingId;
        this.b = productType;
        this.c = productSubType;
        this.d = num;
        this.e = str;
        this.f = feedbackSubtag;
        this.g = str2;
        this.h = z;
        this.i = j2;
    }
}

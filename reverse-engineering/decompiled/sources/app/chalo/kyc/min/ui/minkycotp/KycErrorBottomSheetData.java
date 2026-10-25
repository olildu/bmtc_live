package app.chalo.kyc.min.ui.minkycotp;

import defpackage.dd;
import defpackage.nf1;
import defpackage.vc0;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/kyc/min/ui/minkycotp/KycErrorBottomSheetData;", "", "Companion", "$serializer", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class KycErrorBottomSheetData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] e = {null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new vc0(19))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4139a;
    public final String b;
    public final String c;
    public final KycErrorPositiveCtaType d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/kyc/min/ui/minkycotp/KycErrorBottomSheetData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/kyc/min/ui/minkycotp/KycErrorBottomSheetData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<KycErrorBottomSheetData> serializer() {
            return KycErrorBottomSheetData$$serializer.f4140a;
        }
    }

    public /* synthetic */ KycErrorBottomSheetData(int i, String str, String str2, String str3, KycErrorPositiveCtaType kycErrorPositiveCtaType) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.b(KycErrorBottomSheetData$$serializer.f4140a.getDescriptor(), i, 15);
            throw null;
        }
        this.f4139a = str;
        this.b = str2;
        this.c = str3;
        this.d = kycErrorPositiveCtaType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycErrorBottomSheetData)) {
            return false;
        }
        KycErrorBottomSheetData kycErrorBottomSheetData = (KycErrorBottomSheetData) obj;
        return Intrinsics.d(this.f4139a, kycErrorBottomSheetData.f4139a) && Intrinsics.d(this.b, kycErrorBottomSheetData.b) && Intrinsics.d(this.c, kycErrorBottomSheetData.c) && this.d == kycErrorBottomSheetData.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + nf1.e(nf1.e(this.f4139a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("KycErrorBottomSheetData(title=", this.f4139a, ", message=", this.b, ", positiveCtaText=");
        sbE.append(this.c);
        sbE.append(", positiveCtaType=");
        sbE.append(this.d);
        sbE.append(")");
        return sbE.toString();
    }

    public KycErrorBottomSheetData(String title, String message, String positiveCtaText, KycErrorPositiveCtaType positiveCtaType) {
        Intrinsics.i(title, "title");
        Intrinsics.i(message, "message");
        Intrinsics.i(positiveCtaText, "positiveCtaText");
        Intrinsics.i(positiveCtaType, "positiveCtaType");
        this.f4139a = title;
        this.b = message;
        this.c = positiveCtaText;
        this.d = positiveCtaType;
    }
}

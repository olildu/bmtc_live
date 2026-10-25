package app.chalo.ncmc.data;

import defpackage.cb0;
import defpackage.dd;
import defpackage.hq0;
import defpackage.nf1;
import defpackage.xs;
import in.juspay.hypersdk.analytics.LogConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/ncmc/data/LinkCardConfig;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class LinkCardConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final LinkCardConfig i = new LinkCardConfig();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6030a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/data/LinkCardConfig$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ncmc/data/LinkCardConfig;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<LinkCardConfig> serializer() {
            return LinkCardConfig$$serializer.f6031a;
        }
    }

    public LinkCardConfig() {
        this.f6030a = LogConstants.DEFAULT_CHANNEL;
        this.b = "https://chaloapp-images.s3.ap-south-1.amazonaws.com/Images/image_sample_card_receipt.webp";
        this.c = "How to link your card?";
        this.d = "1. Ask conductor to print Card Status Receipt.\n2. Use the code printed on the receipt and card number to link your card.";
        this.e = 16;
        this.f = 4;
        this.g = 12;
        this.h = 4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkCardConfig)) {
            return false;
        }
        LinkCardConfig linkCardConfig = (LinkCardConfig) obj;
        return Intrinsics.d(this.f6030a, linkCardConfig.f6030a) && Intrinsics.d(this.b, linkCardConfig.b) && Intrinsics.d(this.c, linkCardConfig.c) && Intrinsics.d(this.d, linkCardConfig.d) && this.e == linkCardConfig.e && this.f == linkCardConfig.f && this.g == linkCardConfig.g && this.h == linkCardConfig.h;
    }

    public final int hashCode() {
        return ((((((nf1.e(nf1.e(nf1.e(this.f6030a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h;
    }

    public final String toString() {
        StringBuilder sbE = dd.e("LinkCardConfig(city=", this.f6030a, ", sampleReceiptUrl=", this.b, ", title=");
        cb0.t(sbE, this.c, ", subtitle=", this.d, ", maxCardNumberLength=");
        hq0.p(this.e, this.f, ", maxActivationCodeLength=", ", minCardNumberLength=", sbE);
        return xs.h(this.g, this.h, ", minActivationCodeLength=", ")", sbE);
    }

    public /* synthetic */ LinkCardConfig(int i2, String str, String str2, String str3, String str4, int i3, int i4, int i5, int i6) {
        if (254 != (i2 & 254)) {
            PluginExceptionsKt.b(LinkCardConfig$$serializer.f6031a.getDescriptor(), i2, 254);
            throw null;
        }
        if ((i2 & 1) == 0) {
            this.f6030a = "";
        } else {
            this.f6030a = str;
        }
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = i6;
    }
}

package app.chalo.helper;

import defpackage.e80;
import defpackage.vo1;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/helper/HtmlFormatterStyle;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class HtmlFormatterStyle {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] d = {LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new e80(7)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HtmlFormatterFontWeight f2835a;
    public final int b;
    public final String c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/helper/HtmlFormatterStyle$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/helper/HtmlFormatterStyle;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<HtmlFormatterStyle> serializer() {
            return HtmlFormatterStyle$$serializer.f2836a;
        }
    }

    public /* synthetic */ HtmlFormatterStyle(int i, HtmlFormatterFontWeight htmlFormatterFontWeight, int i2, String str) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.b(HtmlFormatterStyle$$serializer.f2836a.getDescriptor(), i, 3);
            throw null;
        }
        this.f2835a = htmlFormatterFontWeight;
        this.b = i2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HtmlFormatterStyle)) {
            return false;
        }
        HtmlFormatterStyle htmlFormatterStyle = (HtmlFormatterStyle) obj;
        return this.f2835a == htmlFormatterStyle.f2835a && this.b == htmlFormatterStyle.b && Intrinsics.d(this.c, htmlFormatterStyle.c);
    }

    public final int hashCode() {
        int iHashCode = ((this.f2835a.hashCode() * 31) + this.b) * 31;
        String str = this.c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HtmlFormatterStyle(fontWeight=");
        sb.append(this.f2835a);
        sb.append(", textSize=");
        sb.append(this.b);
        sb.append(", textColorHex=");
        return vo1.p(sb, this.c, ")");
    }
}

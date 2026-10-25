package app.chalo.data;

import defpackage.nf1;
import defpackage.qh1;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/data/TextStyleAppModel;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class TextStyleAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextFormatAppModel f2406a;
    public final String b;
    public final int c;
    public final List d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/data/TextStyleAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/data/TextStyleAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<TextStyleAppModel> serializer() {
            return TextStyleAppModel$$serializer.f2407a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new Lazy[]{LazyKt.a(lazyThreadSafetyMode, new qh1(13)), null, null, LazyKt.a(lazyThreadSafetyMode, new qh1(14))};
    }

    public TextStyleAppModel(int i, TextFormatAppModel textFormatAppModel, String str, int i2, List list) {
        this.f2406a = (i & 1) == 0 ? new TextFormatAppModel.Simple("") : textFormatAppModel;
        if ((i & 2) == 0) {
            this.b = "#DE000000";
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = 0;
        } else {
            this.c = i2;
        }
        if ((i & 8) == 0) {
            this.d = EmptyList.f17557a;
        } else {
            this.d = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStyleAppModel)) {
            return false;
        }
        TextStyleAppModel textStyleAppModel = (TextStyleAppModel) obj;
        return Intrinsics.d(this.f2406a, textStyleAppModel.f2406a) && Intrinsics.d(this.b, textStyleAppModel.b) && this.c == textStyleAppModel.c && Intrinsics.d(this.d, textStyleAppModel.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((nf1.e(this.f2406a.hashCode() * 31, 31, this.b) + this.c) * 31);
    }

    public final String toString() {
        return "TextStyleAppModel(text=" + this.f2406a + ", textColor=" + this.b + ", textSize=" + this.c + ", htmlFormattedTextList=" + this.d + ")";
    }

    public TextStyleAppModel(TextFormatAppModel textFormatAppModel, String textColor, int i, List htmlFormattedTextList) {
        Intrinsics.i(textColor, "textColor");
        Intrinsics.i(htmlFormattedTextList, "htmlFormattedTextList");
        this.f2406a = textFormatAppModel;
        this.b = textColor;
        this.c = i;
        this.d = htmlFormattedTextList;
    }

    public TextStyleAppModel() {
        this(new TextFormatAppModel.Simple(""), "#DE000000", 0, EmptyList.f17557a);
    }
}

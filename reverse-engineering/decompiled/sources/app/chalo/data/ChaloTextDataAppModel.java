package app.chalo.data;

import app.chalo.providers.iconassetprovider.IconType;
import defpackage.ul;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/data/ChaloTextDataAppModel;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ChaloTextDataAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BackgroundAppModel f2335a;
    public final IconType b;
    public final int c;
    public final IconType d;
    public final int e;
    public final TextStyleAppModel f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/data/ChaloTextDataAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/data/ChaloTextDataAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ChaloTextDataAppModel> serializer() {
            return ChaloTextDataAppModel$$serializer.f2336a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        g = new Lazy[]{null, LazyKt.a(lazyThreadSafetyMode, new ul(5)), null, LazyKt.a(lazyThreadSafetyMode, new ul(6)), null, null};
    }

    public /* synthetic */ ChaloTextDataAppModel(int i, BackgroundAppModel backgroundAppModel, IconType iconType, int i2, IconType iconType2, int i3, TextStyleAppModel textStyleAppModel) {
        this.f2335a = (i & 1) == 0 ? new BackgroundAppModel() : backgroundAppModel;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = iconType;
        }
        if ((i & 4) == 0) {
            this.c = 0;
        } else {
            this.c = i2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = iconType2;
        }
        if ((i & 16) == 0) {
            this.e = 0;
        } else {
            this.e = i3;
        }
        if ((i & 32) == 0) {
            this.f = new TextStyleAppModel();
        } else {
            this.f = textStyleAppModel;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloTextDataAppModel)) {
            return false;
        }
        ChaloTextDataAppModel chaloTextDataAppModel = (ChaloTextDataAppModel) obj;
        return Intrinsics.d(this.f2335a, chaloTextDataAppModel.f2335a) && this.b == chaloTextDataAppModel.b && this.c == chaloTextDataAppModel.c && this.d == chaloTextDataAppModel.d && this.e == chaloTextDataAppModel.e && Intrinsics.d(this.f, chaloTextDataAppModel.f);
    }

    public final int hashCode() {
        int iHashCode = this.f2335a.hashCode() * 31;
        IconType iconType = this.b;
        int iHashCode2 = (((iHashCode + (iconType == null ? 0 : iconType.hashCode())) * 31) + this.c) * 31;
        IconType iconType2 = this.d;
        return this.f.hashCode() + ((((iHashCode2 + (iconType2 != null ? iconType2.hashCode() : 0)) * 31) + this.e) * 31);
    }

    public final String toString() {
        return "ChaloTextDataAppModel(background=" + this.f2335a + ", endIcon=" + this.b + ", endIconTextPadding=" + this.c + ", startIcon=" + this.d + ", startIconTextPadding=" + this.e + ", textStyle=" + this.f + ")";
    }

    public ChaloTextDataAppModel(BackgroundAppModel backgroundAppModel, IconType iconType, int i, IconType iconType2, int i2, TextStyleAppModel textStyleAppModel) {
        this.f2335a = backgroundAppModel;
        this.b = iconType;
        this.c = i;
        this.d = iconType2;
        this.e = i2;
        this.f = textStyleAppModel;
    }
}

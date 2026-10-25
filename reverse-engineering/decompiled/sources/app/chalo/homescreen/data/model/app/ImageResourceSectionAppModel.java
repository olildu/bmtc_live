package app.chalo.homescreen.data.model.app;

import app.chalo.providers.iconassetprovider.IconType;
import defpackage.e80;
import defpackage.xs;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/homescreen/data/model/app/ImageResourceSectionAppModel;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ImageResourceSectionAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3755a;
    public final int b;
    public final String c;
    public final ImageResourcePlacement d;
    public final boolean e;
    public final ImageResourceCtaType f;
    public final String g;
    public final IconType h;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/homescreen/data/model/app/ImageResourceSectionAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/homescreen/data/model/app/ImageResourceSectionAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ImageResourceSectionAppModel> serializer() {
            return ImageResourceSectionAppModel$$serializer.f3756a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        i = new Lazy[]{null, null, null, LazyKt.a(lazyThreadSafetyMode, new e80(25)), null, LazyKt.a(lazyThreadSafetyMode, new e80(26)), null, LazyKt.a(lazyThreadSafetyMode, new e80(27))};
    }

    public /* synthetic */ ImageResourceSectionAppModel(int i2, String str, int i3, String str2, ImageResourcePlacement imageResourcePlacement, boolean z, ImageResourceCtaType imageResourceCtaType, String str3, IconType iconType) {
        if (3 != (i2 & 3)) {
            PluginExceptionsKt.b(ImageResourceSectionAppModel$$serializer.f3756a.getDescriptor(), i2, 3);
            throw null;
        }
        this.f3755a = str;
        this.b = i3;
        if ((i2 & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i2 & 8) == 0) {
            this.d = ImageResourcePlacement.BELOW_HEADER;
        } else {
            this.d = imageResourcePlacement;
        }
        if ((i2 & 16) == 0) {
            this.e = false;
        } else {
            this.e = z;
        }
        if ((i2 & 32) == 0) {
            this.f = null;
        } else {
            this.f = imageResourceCtaType;
        }
        if ((i2 & 64) == 0) {
            this.g = null;
        } else {
            this.g = str3;
        }
        if ((i2 & 128) == 0) {
            this.h = null;
        } else {
            this.h = iconType;
        }
    }

    public static ImageResourceSectionAppModel a(ImageResourceSectionAppModel imageResourceSectionAppModel) {
        String backgroundImageUrl = imageResourceSectionAppModel.f3755a;
        int i2 = imageResourceSectionAppModel.b;
        String str = imageResourceSectionAppModel.c;
        ImageResourcePlacement placement = imageResourceSectionAppModel.d;
        boolean z = imageResourceSectionAppModel.e;
        String str2 = imageResourceSectionAppModel.g;
        IconType iconType = imageResourceSectionAppModel.h;
        imageResourceSectionAppModel.getClass();
        Intrinsics.i(backgroundImageUrl, "backgroundImageUrl");
        Intrinsics.i(placement, "placement");
        return new ImageResourceSectionAppModel(backgroundImageUrl, i2, str, placement, z, null, str2, iconType);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageResourceSectionAppModel)) {
            return false;
        }
        ImageResourceSectionAppModel imageResourceSectionAppModel = (ImageResourceSectionAppModel) obj;
        return Intrinsics.d(this.f3755a, imageResourceSectionAppModel.f3755a) && this.b == imageResourceSectionAppModel.b && Intrinsics.d(this.c, imageResourceSectionAppModel.c) && this.d == imageResourceSectionAppModel.d && this.e == imageResourceSectionAppModel.e && this.f == imageResourceSectionAppModel.f && Intrinsics.d(this.g, imageResourceSectionAppModel.g) && this.h == imageResourceSectionAppModel.h;
    }

    public final int hashCode() {
        int iHashCode = ((this.f3755a.hashCode() * 31) + this.b) * 31;
        String str = this.c;
        int iHashCode2 = (((this.d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31) + (this.e ? 1231 : 1237)) * 31;
        ImageResourceCtaType imageResourceCtaType = this.f;
        int iHashCode3 = (iHashCode2 + (imageResourceCtaType == null ? 0 : imageResourceCtaType.hashCode())) * 31;
        String str2 = this.g;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        IconType iconType = this.h;
        return iHashCode4 + (iconType != null ? iconType.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM = xs.m(this.b, "ImageResourceSectionAppModel(backgroundImageUrl=", this.f3755a, ", contentPadding=", ", onClickUrl=");
        sbM.append(this.c);
        sbM.append(", placement=");
        sbM.append(this.d);
        sbM.append(", showDivider=");
        sbM.append(this.e);
        sbM.append(", ctaType=");
        sbM.append(this.f);
        sbM.append(", sectionTitle=");
        sbM.append(this.g);
        sbM.append(", fallbackIcon=");
        sbM.append(this.h);
        sbM.append(")");
        return sbM.toString();
    }

    public ImageResourceSectionAppModel(String str, int i2, String str2, ImageResourcePlacement placement, boolean z, ImageResourceCtaType imageResourceCtaType, String str3, IconType iconType) {
        Intrinsics.i(placement, "placement");
        this.f3755a = str;
        this.b = i2;
        this.c = str2;
        this.d = placement;
        this.e = z;
        this.f = imageResourceCtaType;
        this.g = str3;
        this.h = iconType;
    }

    public /* synthetic */ ImageResourceSectionAppModel(String str, int i2, String str2, ImageResourcePlacement imageResourcePlacement, boolean z, ImageResourceCtaType imageResourceCtaType, String str3, IconType iconType, int i3) {
        this(str, i2, str2, (i3 & 8) != 0 ? ImageResourcePlacement.BELOW_HEADER : imageResourcePlacement, (i3 & 16) != 0 ? false : z, imageResourceCtaType, str3, (i3 & 128) != 0 ? null : iconType);
    }
}

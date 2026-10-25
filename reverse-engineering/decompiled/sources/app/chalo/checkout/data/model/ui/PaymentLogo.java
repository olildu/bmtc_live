package app.chalo.checkout.data.model.ui;

import app.chalo.providers.iconassetprovider.IconType;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/checkout/data/model/ui/PaymentLogo;", "", "Url", "Icon", "PlatformDrawable", "Lapp/chalo/checkout/data/model/ui/PaymentLogo$Icon;", "Lapp/chalo/checkout/data/model/ui/PaymentLogo$PlatformDrawable;", "Lapp/chalo/checkout/data/model/ui/PaymentLogo$Url;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PaymentLogo {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/data/model/ui/PaymentLogo$Icon;", "Lapp/chalo/checkout/data/model/ui/PaymentLogo;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Icon extends PaymentLogo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final IconType f1345a;

        public Icon(IconType iconType) {
            Intrinsics.i(iconType, "iconType");
            this.f1345a = iconType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Icon) && this.f1345a == ((Icon) obj).f1345a;
        }

        public final int hashCode() {
            return this.f1345a.hashCode();
        }

        public final String toString() {
            return "Icon(iconType=" + this.f1345a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/data/model/ui/PaymentLogo$PlatformDrawable;", "Lapp/chalo/checkout/data/model/ui/PaymentLogo;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PlatformDrawable extends PaymentLogo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlatformDrawableAsset f1346a;

        public PlatformDrawable(PlatformDrawableAsset platformDrawableAsset) {
            this.f1346a = platformDrawableAsset;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PlatformDrawable) && Intrinsics.d(this.f1346a, ((PlatformDrawable) obj).f1346a);
        }

        public final int hashCode() {
            return this.f1346a.hashCode();
        }

        public final String toString() {
            return "PlatformDrawable(drawableAsset=" + this.f1346a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/data/model/ui/PaymentLogo$Url;", "Lapp/chalo/checkout/data/model/ui/PaymentLogo;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Url extends PaymentLogo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f1347a;

        public Url(String url) {
            Intrinsics.i(url, "url");
            this.f1347a = url;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Url) && Intrinsics.d(this.f1347a, ((Url) obj).f1347a);
        }

        public final int hashCode() {
            return this.f1347a.hashCode();
        }

        public final String toString() {
            return vo1.B("Url(url=", this.f1347a, ")");
        }
    }
}

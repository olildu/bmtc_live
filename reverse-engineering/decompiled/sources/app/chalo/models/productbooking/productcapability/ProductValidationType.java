package app.chalo.models.productbooking.productcapability;

import defpackage.cb0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/models/productbooking/productcapability/ProductValidationType;", "", "Qr", "QrScanner", "Lapp/chalo/models/productbooking/productcapability/ProductValidationType$Qr;", "Lapp/chalo/models/productbooking/productcapability/ProductValidationType$QrScanner;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ProductValidationType {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/models/productbooking/productcapability/ProductValidationType$Qr;", "Lapp/chalo/models/productbooking/productcapability/ProductValidationType;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Qr extends ProductValidationType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f5678a;

        public Qr(boolean z) {
            this.f5678a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Qr) && this.f5678a == ((Qr) obj).f5678a;
        }

        public final int hashCode() {
            return this.f5678a ? 1231 : 1237;
        }

        public final String toString() {
            return cb0.k("Qr(multipleSupported=", ")", this.f5678a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/models/productbooking/productcapability/ProductValidationType$QrScanner;", "Lapp/chalo/models/productbooking/productcapability/ProductValidationType;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class QrScanner extends ProductValidationType {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof QrScanner);
        }

        public final int hashCode() {
            return (int) 0;
        }

        public final String toString() {
            return "QrScanner(timeout=0)";
        }
    }
}

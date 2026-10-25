package app.chalo.productbooking.common.data.models.app;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lapp/chalo/productbooking/common/data/models/app/ProductValidationType;", "", "validationType", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValidationType", "()Ljava/lang/String;", "VEHICLE", "QR", "UNKNOWN", "Companion", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum ProductValidationType {
    VEHICLE("vehicle"),
    QR("qr"),
    UNKNOWN("");

    private final String validationType;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productbooking/common/data/models/app/ProductValidationType$Companion;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static ProductValidationType a(String str) {
            ProductValidationType next;
            Iterator<ProductValidationType> it = ProductValidationType.getEntries().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.d(next.getValidationType(), str));
            ProductValidationType productValidationType = next;
            return productValidationType == null ? ProductValidationType.UNKNOWN : productValidationType;
        }
    }

    ProductValidationType(String str) {
        this.validationType = str;
    }

    public static EnumEntries<ProductValidationType> getEntries() {
        return $ENTRIES;
    }

    public final String getValidationType() {
        return this.validationType;
    }
}

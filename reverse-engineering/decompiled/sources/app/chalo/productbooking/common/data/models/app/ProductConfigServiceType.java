package app.chalo.productbooking.common.data.models.app;

import defpackage.ox0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lapp/chalo/productbooking/common/data/models/app/ProductConfigServiceType;", "", "<init>", "(Ljava/lang/String;I)V", "REGULAR", "PREMIUM", "UNKNOWN", "Companion", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public enum ProductConfigServiceType {
    REGULAR,
    PREMIUM,
    UNKNOWN;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new ox0(10));

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productbooking/common/data/models/app/ProductConfigServiceType$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productbooking/common/data/models/app/ProductConfigServiceType;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static List a(Companion companion, List list) {
            ProductConfigServiceType productConfigServiceTypeValueOf;
            companion.getClass();
            Intrinsics.i(list, "list");
            List<String> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.v(list2, 10));
            for (String str : list2) {
                ProductConfigServiceType.INSTANCE.getClass();
                Intrinsics.i(str, "str");
                try {
                    productConfigServiceTypeValueOf = ProductConfigServiceType.valueOf(str);
                } catch (IllegalArgumentException unused) {
                    productConfigServiceTypeValueOf = ProductConfigServiceType.UNKNOWN;
                }
                arrayList.add(productConfigServiceTypeValueOf);
            }
            return list.isEmpty() ? CollectionsKt.R(ProductConfigServiceType.REGULAR) : arrayList;
        }

        public final KSerializer<ProductConfigServiceType> serializer() {
            return (KSerializer) ProductConfigServiceType.$cachedSerializer$delegate.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.b("app.chalo.productbooking.common.data.models.app.ProductConfigServiceType", values());
    }

    public static EnumEntries<ProductConfigServiceType> getEntries() {
        return $ENTRIES;
    }
}

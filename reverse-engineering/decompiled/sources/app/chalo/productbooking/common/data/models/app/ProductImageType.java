package app.chalo.productbooking.common.data.models.app;

import defpackage.ox0;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0013\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, d2 = {"Lapp/chalo/productbooking/common/data/models/app/ProductImageType;", "", "iconType", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getIconType", "()Ljava/lang/String;", "PASS_PURCHASE_MARKETING_URL", "PASS_CARD_INFO_URL", "AGENCY_BRANDING_URL", "PRODUCT_SOCIAL_VALIDATION_URL", "PLAN_SCREEN_FAQS_URL", "CHALO_BUS_TAB_PASS_NUDGE_URL", "NOT_AVAILABLE", "Companion", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public enum ProductImageType {
    PASS_PURCHASE_MARKETING_URL("PASS_PURCHASE_MARKETING_URL"),
    PASS_CARD_INFO_URL("PASS_CARD_INFO_URL"),
    AGENCY_BRANDING_URL("AGENCY_BRANDING_URL"),
    PRODUCT_SOCIAL_VALIDATION_URL("PRODUCT_SOCIAL_VALIDATION_URL"),
    PLAN_SCREEN_FAQS_URL("PLAN_SCREEN_FAQS_URL"),
    CHALO_BUS_TAB_PASS_NUDGE_URL("CHALO_BUS_TAB_PASS_NUDGE_URL"),
    NOT_AVAILABLE("");

    private final String iconType;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new ox0(12));

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productbooking/common/data/models/app/ProductImageType$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productbooking/common/data/models/app/ProductImageType;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ProductImageType> serializer() {
            return (KSerializer) ProductImageType.$cachedSerializer$delegate.getValue();
        }
    }

    ProductImageType(String str) {
        this.iconType = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.b("app.chalo.productbooking.common.data.models.app.ProductImageType", values());
    }

    public static EnumEntries<ProductImageType> getEntries() {
        return $ENTRIES;
    }

    public final String getIconType() {
        return this.iconType;
    }
}

package app.chalo.home.data.model.app.response;

import defpackage.p7;
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
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, d2 = {"Lapp/chalo/home/data/model/app/response/BannerType;", "", "type", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "PASS_EXPIRED_WITH_REMAINING_RIDES", "PASS_EXPIRED_WITH_NO_REMAINING_RIDES", "PREMIUM_PASS_EXPIRED_WITHIN_RENEWAL_WINDOW_WITH_REMAINING_RIDES", "PREMIUM_PASS_EXPIRED_WITHIN_RENEWAL_WINDOW_WITH_NO_REMAINING_RIDES", "PREMIUM_PASS_EXPIRED_OUTSIDE_RENEWAL_WINDOW_WITH_REMAINING_RIDES", "PREMIUM_PASS_EXPIRED_OUTSIDE_RENEWAL_WINDOW_WITH_NO_REMAINING_RIDES", "PASS_RIDE_EXPIRING", "PASS_VALIDITY_EXPIRING", "NONE", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public enum BannerType {
    PASS_EXPIRED_WITH_REMAINING_RIDES("PASS_EXPIRED_WITH_REMAINING_RIDES"),
    PASS_EXPIRED_WITH_NO_REMAINING_RIDES("PASS_EXPIRED_WITH_NO_REMAINING_RIDES"),
    PREMIUM_PASS_EXPIRED_WITHIN_RENEWAL_WINDOW_WITH_REMAINING_RIDES("PREMIUM_PASS_EXPIRED_WITHIN_RENEWAL_WINDOW_WITH_REMAINING_RIDES"),
    PREMIUM_PASS_EXPIRED_WITHIN_RENEWAL_WINDOW_WITH_NO_REMAINING_RIDES("PREMIUM_PASS_EXPIRED_WITHIN_RENEWAL_WINDOW_WITH_NO_REMAINING_RIDES"),
    PREMIUM_PASS_EXPIRED_OUTSIDE_RENEWAL_WINDOW_WITH_REMAINING_RIDES("PREMIUM_PASS_EXPIRED_OUTSIDE_RENEWAL_WINDOW_WITH_REMAINING_RIDES"),
    PREMIUM_PASS_EXPIRED_OUTSIDE_RENEWAL_WINDOW_WITH_NO_REMAINING_RIDES("PREMIUM_PASS_EXPIRED_OUTSIDE_RENEWAL_WINDOW_WITH_NO_REMAINING_RIDES"),
    PASS_RIDE_EXPIRING("PASS_RIDE_EXPIRING"),
    PASS_VALIDITY_EXPIRING("PASS_VALIDITY_EXPIRING"),
    NONE("");

    private final String type;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new p7(20));

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/home/data/model/app/response/BannerType$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/home/data/model/app/response/BannerType;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<BannerType> serializer() {
            return (KSerializer) BannerType.$cachedSerializer$delegate.getValue();
        }
    }

    BannerType(String str) {
        this.type = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.b("app.chalo.home.data.model.app.response.BannerType", values());
    }

    public static EnumEntries<BannerType> getEntries() {
        return $ENTRIES;
    }

    public final String getType() {
        return this.type;
    }
}

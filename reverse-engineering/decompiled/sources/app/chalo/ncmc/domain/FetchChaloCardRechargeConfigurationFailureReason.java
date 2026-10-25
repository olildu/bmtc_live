package app.chalo.ncmc.domain;

import app.chalo.mvibase.simple.UseCaseSpecificOperationFailureReason;
import defpackage.a30;
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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lapp/chalo/ncmc/domain/FetchChaloCardRechargeConfigurationFailureReason;", "Lapp/chalo/mvibase/simple/UseCaseSpecificOperationFailureReason;", "", "errorCode", "", "<init>", "(Ljava/lang/String;II)V", "getErrorCode", "()I", "NO_ACTIVE_RECHARGE_CONFIG_FOUND", "UNKNOWN", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public enum FetchChaloCardRechargeConfigurationFailureReason implements UseCaseSpecificOperationFailureReason {
    NO_ACTIVE_RECHARGE_CONFIG_FOUND(6010),
    UNKNOWN(6999);

    private final int errorCode;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new a30(16));

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/domain/FetchChaloCardRechargeConfigurationFailureReason$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ncmc/domain/FetchChaloCardRechargeConfigurationFailureReason;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<FetchChaloCardRechargeConfigurationFailureReason> serializer() {
            return (KSerializer) FetchChaloCardRechargeConfigurationFailureReason.$cachedSerializer$delegate.getValue();
        }
    }

    FetchChaloCardRechargeConfigurationFailureReason(int i) {
        this.errorCode = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.b("app.chalo.ncmc.domain.FetchChaloCardRechargeConfigurationFailureReason", values());
    }

    public static EnumEntries<FetchChaloCardRechargeConfigurationFailureReason> getEntries() {
        return $ENTRIES;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }
}

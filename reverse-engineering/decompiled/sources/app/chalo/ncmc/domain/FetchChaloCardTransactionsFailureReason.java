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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lapp/chalo/ncmc/domain/FetchChaloCardTransactionsFailureReason;", "Lapp/chalo/mvibase/simple/UseCaseSpecificOperationFailureReason;", "", "errorCode", "", "<init>", "(Ljava/lang/String;II)V", "getErrorCode", "()I", "CITY_NOT_FOUND", "UNKNOWN_SERVER_ERROR", "UNKNOWN_LOCAL_ERROR", "INTERNAL_SERVER_ERROR", "CARD_NOT_FOUND", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public enum FetchChaloCardTransactionsFailureReason implements UseCaseSpecificOperationFailureReason {
    CITY_NOT_FOUND(-1),
    UNKNOWN_SERVER_ERROR(-2),
    UNKNOWN_LOCAL_ERROR(-3),
    INTERNAL_SERVER_ERROR(1004),
    CARD_NOT_FOUND(3003);

    private final int errorCode;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new a30(17));

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/domain/FetchChaloCardTransactionsFailureReason$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ncmc/domain/FetchChaloCardTransactionsFailureReason;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<FetchChaloCardTransactionsFailureReason> serializer() {
            return (KSerializer) FetchChaloCardTransactionsFailureReason.$cachedSerializer$delegate.getValue();
        }
    }

    FetchChaloCardTransactionsFailureReason(int i) {
        this.errorCode = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.b("app.chalo.ncmc.domain.FetchChaloCardTransactionsFailureReason", values());
    }

    public static EnumEntries<FetchChaloCardTransactionsFailureReason> getEntries() {
        return $ENTRIES;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }
}

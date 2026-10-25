package app.chalo.checkout.domain;

import androidx.media3.common.PlaybackException;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lapp/chalo/checkout/domain/ChaloPaymentFailureReason;", "", "errorCode", "", "<init>", "(Ljava/lang/String;II)V", "getErrorCode", "()I", "UNKNOWN_ERROR", "CACHED_WALLET_FETCH_FAILED", "UNAUTHORIZED", "INTERNAL_SERVER_ERROR", "WALLET_NOT_FOUND_ERROR", "WALLET_INACTIVE_ERROR", "RECLAIM_ERROR", "WALLET_BLOCKED_ERROR", "INSUFFICIENT_BALANCE_ERROR", "ORDER_NOT_FOUND", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum ChaloPaymentFailureReason {
    UNKNOWN_ERROR(0),
    CACHED_WALLET_FETCH_FAILED(1),
    UNAUTHORIZED(2),
    INTERNAL_SERVER_ERROR(1004),
    WALLET_NOT_FOUND_ERROR(2013),
    WALLET_INACTIVE_ERROR(2014),
    RECLAIM_ERROR(2015),
    WALLET_BLOCKED_ERROR(2019),
    INSUFFICIENT_BALANCE_ERROR(2020),
    ORDER_NOT_FOUND(PlaybackException.ERROR_CODE_AUDIO_TRACK_INIT_FAILED);

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());
    private final int errorCode;

    ChaloPaymentFailureReason(int i) {
        this.errorCode = i;
    }

    public static EnumEntries<ChaloPaymentFailureReason> getEntries() {
        return $ENTRIES;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }
}

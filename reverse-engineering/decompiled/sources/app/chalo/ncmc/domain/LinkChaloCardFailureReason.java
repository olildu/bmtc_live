package app.chalo.ncmc.domain;

import com.facebook.ads.AdError;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lapp/chalo/ncmc/domain/LinkChaloCardFailureReason;", "", "errorCode", "", "<init>", "(Ljava/lang/String;II)V", "getErrorCode", "()I", "INVALID_CARD_NUMBER", "INVALID_LINK_CODE", "CARD_LINKED_TO_ANOTHER_NUMBER", "SERVER_ERROR", "UNKNOWN_ERROR", "KYC_NOT_DONE", "CARD_NOT_REGISTERED_IN_CURR_CITY", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum LinkChaloCardFailureReason {
    INVALID_CARD_NUMBER(3003),
    INVALID_LINK_CODE(7001),
    CARD_LINKED_TO_ANOTHER_NUMBER(AdError.LOAD_CALLED_WHILE_SHOWING_AD),
    SERVER_ERROR(1004),
    UNKNOWN_ERROR(0),
    KYC_NOT_DONE(AdError.CLEAR_TEXT_SUPPORT_NOT_ALLOWED),
    CARD_NOT_REGISTERED_IN_CURR_CITY(AdError.MISSING_DEPENDENCIES_ERROR);

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());
    private final int errorCode;

    LinkChaloCardFailureReason(int i) {
        this.errorCode = i;
    }

    public static EnumEntries<LinkChaloCardFailureReason> getEntries() {
        return $ENTRIES;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }
}

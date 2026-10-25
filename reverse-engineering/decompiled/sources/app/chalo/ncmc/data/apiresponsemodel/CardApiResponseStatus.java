package app.chalo.ncmc.data.apiresponsemodel;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lapp/chalo/ncmc/data/apiresponsemodel/CardApiResponseStatus;", "", "statue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getStatue", "()Ljava/lang/String;", "SUCCESS", "FAILED", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum CardApiResponseStatus {
    SUCCESS("SUCCESS"),
    FAILED("FAILED");

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());
    private final String statue;

    CardApiResponseStatus(String str) {
        this.statue = str;
    }

    public static EnumEntries<CardApiResponseStatus> getEntries() {
        return $ENTRIES;
    }

    public final String getStatue() {
        return this.statue;
    }
}

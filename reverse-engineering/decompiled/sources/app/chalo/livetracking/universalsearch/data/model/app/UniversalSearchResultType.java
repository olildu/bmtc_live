package app.chalo.livetracking.universalsearch.data.model.app;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lapp/chalo/livetracking/universalsearch/data/model/app/UniversalSearchResultType;", "", "resultType", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getResultType", "()Ljava/lang/String;", "PLACE", "STOP", "ROUTE", "TRIP", "Companion", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum UniversalSearchResultType {
    PLACE("place"),
    STOP("stop"),
    ROUTE("route"),
    TRIP("trip");

    private final String resultType;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/data/model/app/UniversalSearchResultType$Companion;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static UniversalSearchResultType a(String str) {
            UniversalSearchResultType universalSearchResultType;
            UniversalSearchResultType[] universalSearchResultTypeArrValues = UniversalSearchResultType.values();
            int length = universalSearchResultTypeArrValues.length;
            int i = 0;
            while (true) {
                universalSearchResultType = null;
                String lowerCase = null;
                if (i >= length) {
                    break;
                }
                UniversalSearchResultType universalSearchResultType2 = universalSearchResultTypeArrValues[i];
                String resultType = universalSearchResultType2.getResultType();
                Locale locale = Locale.ROOT;
                String lowerCase2 = resultType.toLowerCase(locale);
                Intrinsics.h(lowerCase2, "toLowerCase(...)");
                if (str != null) {
                    lowerCase = str.toLowerCase(locale);
                    Intrinsics.h(lowerCase, "toLowerCase(...)");
                }
                if (lowerCase2.equals(lowerCase)) {
                    universalSearchResultType = universalSearchResultType2;
                    break;
                }
                i++;
            }
            return universalSearchResultType == null ? UniversalSearchResultType.PLACE : universalSearchResultType;
        }
    }

    UniversalSearchResultType(String str) {
        this.resultType = str;
    }

    public static EnumEntries<UniversalSearchResultType> getEntries() {
        return $ENTRIES;
    }

    public final String getResultType() {
        return this.resultType;
    }
}

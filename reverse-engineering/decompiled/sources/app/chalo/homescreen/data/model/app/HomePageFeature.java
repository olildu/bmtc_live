package app.chalo.homescreen.data.model.app;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, d2 = {"Lapp/chalo/homescreen/data/model/app/HomePageFeature;", "", "featureType", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getFeatureType", "()Ljava/lang/String;", "REGULAR_BUS", "CHALO_BUS", "CARD_RECHARGE", "METRO", "TICKETS_PASSES", "PLOTLINE_WIDGET", "FOOTER", "IMAGE_RESOURCE", "UNKNOWN", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum HomePageFeature {
    REGULAR_BUS("REGULAR_BUS"),
    CHALO_BUS("CHALO_BUS"),
    CARD_RECHARGE("CARD_RECHARGE"),
    METRO("METRO"),
    TICKETS_PASSES("TICKETS_PASSES"),
    PLOTLINE_WIDGET("PLOTLINE_WIDGET"),
    FOOTER("FOOTER"),
    IMAGE_RESOURCE("IMAGE_RESOURCE"),
    UNKNOWN("UNKNOWN");

    private final String featureType;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/homescreen/data/model/app/HomePageFeature$Companion;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    HomePageFeature(String str) {
        this.featureType = str;
    }

    public static EnumEntries<HomePageFeature> getEntries() {
        return $ENTRIES;
    }

    public final String getFeatureType() {
        return this.featureType;
    }
}

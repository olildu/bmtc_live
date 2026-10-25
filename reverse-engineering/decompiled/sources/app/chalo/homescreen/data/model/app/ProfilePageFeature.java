package app.chalo.homescreen.data.model.app;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0087\u0081\u0002\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0019B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u001a"}, d2 = {"Lapp/chalo/homescreen/data/model/app/ProfilePageFeature;", "", "featureType", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getFeatureType", "()Ljava/lang/String;", "PROFILE", "ACCOUNT_SETTINGS", "CHALO_WALLET", "TICKETS_PASSES", "SAVED_PLACES_AND_RIDES", "BUS_STOPS_NEAR_ME", "CHANGE_LANGUAGE", "SOS", "ELECTRICITY_BILL", "CUSTOMER_SUPPORT", "TERMS_CONDITIONS", "CHANGE_ENVIRONMENT", "PLOTLINE_WIDGET", "MANAGE_TRAVEL_CARD", "USER_CONSENT", "MANAGE_CHALO_UPI", "UNKNOWN", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum ProfilePageFeature {
    PROFILE("PROFILE"),
    ACCOUNT_SETTINGS("ACCOUNT_SETTINGS"),
    CHALO_WALLET("CHALO_WALLET"),
    TICKETS_PASSES("TICKETS_PASSES"),
    SAVED_PLACES_AND_RIDES("SAVED_PLACES_AND_RIDES"),
    BUS_STOPS_NEAR_ME("BUS_STOPS_NEAR_ME"),
    CHANGE_LANGUAGE("CHANGE_LANGUAGE"),
    SOS("SOS"),
    ELECTRICITY_BILL("ELECTRICITY_BILL"),
    CUSTOMER_SUPPORT("CUSTOMER_SUPPORT"),
    TERMS_CONDITIONS("TERMS_CONDITIONS"),
    CHANGE_ENVIRONMENT("CHANGE_ENVIRONMENT"),
    PLOTLINE_WIDGET("PLOTLINE_WIDGET"),
    MANAGE_TRAVEL_CARD("MANAGE_TRAVEL_CARD"),
    USER_CONSENT("USER_CONSENT"),
    MANAGE_CHALO_UPI("MANAGE_CHALO_UPI"),
    UNKNOWN("UNKNOWN");

    private final String featureType;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/homescreen/data/model/app/ProfilePageFeature$Companion;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    ProfilePageFeature(String str) {
        this.featureType = str;
    }

    public static EnumEntries<ProfilePageFeature> getEntries() {
        return $ENTRIES;
    }

    public final String getFeatureType() {
        return this.featureType;
    }
}

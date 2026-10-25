package app.chalo.validationsdk.blevalidation.data.models;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/data/models/ProductValidationBrandingLogoTypes;", "", "cityName", "", "agencyName", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getCityName", "()Ljava/lang/String;", "getAgencyName", "BHOPAL_BCLL", "ONDC", "Companion", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum ProductValidationBrandingLogoTypes {
    BHOPAL_BCLL("bhopal", "bcll"),
    ONDC("ondc", "ondc");

    private final String agencyName;
    private final String cityName;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

    ProductValidationBrandingLogoTypes(String str, String str2) {
        this.cityName = str;
        this.agencyName = str2;
    }

    public static EnumEntries<ProductValidationBrandingLogoTypes> getEntries() {
        return $ENTRIES;
    }

    public final String getAgencyName() {
        return this.agencyName;
    }

    public final String getCityName() {
        return this.cityName;
    }
}

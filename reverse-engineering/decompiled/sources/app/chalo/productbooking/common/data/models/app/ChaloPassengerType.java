package app.chalo.productbooking.common.data.models.app;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lapp/chalo/productbooking/common/data/models/app/ChaloPassengerType;", "", "type", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "Adult", "Child", "SeniorCitizen", "Student", "Women", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum ChaloPassengerType {
    Adult("adult"),
    Child("child"),
    SeniorCitizen("senior_citizen"),
    Student("student"),
    Women("women");

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());
    private final String type;

    ChaloPassengerType(String str) {
        this.type = str;
    }

    public static EnumEntries<ChaloPassengerType> getEntries() {
        return $ENTRIES;
    }

    public final String getType() {
        return this.type;
    }
}

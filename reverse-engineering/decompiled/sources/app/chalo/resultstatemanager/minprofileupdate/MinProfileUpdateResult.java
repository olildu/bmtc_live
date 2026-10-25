package app.chalo.resultstatemanager.minprofileupdate;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/resultstatemanager/minprofileupdate/MinProfileUpdateResult;", "", "ProfileUpdated", "Skipped", "Dismissed", "Lapp/chalo/resultstatemanager/minprofileupdate/MinProfileUpdateResult$Dismissed;", "Lapp/chalo/resultstatemanager/minprofileupdate/MinProfileUpdateResult$ProfileUpdated;", "Lapp/chalo/resultstatemanager/minprofileupdate/MinProfileUpdateResult$Skipped;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class MinProfileUpdateResult {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/resultstatemanager/minprofileupdate/MinProfileUpdateResult$Dismissed;", "Lapp/chalo/resultstatemanager/minprofileupdate/MinProfileUpdateResult;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Dismissed extends MinProfileUpdateResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Dismissed f9057a = new Dismissed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Dismissed);
        }

        public final int hashCode() {
            return -469651539;
        }

        public final String toString() {
            return "Dismissed";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/resultstatemanager/minprofileupdate/MinProfileUpdateResult$ProfileUpdated;", "Lapp/chalo/resultstatemanager/minprofileupdate/MinProfileUpdateResult;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProfileUpdated extends MinProfileUpdateResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ProfileUpdated f9058a = new ProfileUpdated();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ProfileUpdated);
        }

        public final int hashCode() {
            return 326714958;
        }

        public final String toString() {
            return "ProfileUpdated";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/resultstatemanager/minprofileupdate/MinProfileUpdateResult$Skipped;", "Lapp/chalo/resultstatemanager/minprofileupdate/MinProfileUpdateResult;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Skipped extends MinProfileUpdateResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Skipped f9059a = new Skipped();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Skipped);
        }

        public final int hashCode() {
            return 1994834740;
        }

        public final String toString() {
            return "Skipped";
        }
    }
}

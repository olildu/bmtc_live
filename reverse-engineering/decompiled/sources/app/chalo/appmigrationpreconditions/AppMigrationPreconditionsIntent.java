package app.chalo.appmigrationpreconditions;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/appmigrationpreconditions/AppMigrationPreconditionsIntent;", "", "InitialisationIntent", "RetryClickedIntent", "BackClickedIntent", "Lapp/chalo/appmigrationpreconditions/AppMigrationPreconditionsIntent$BackClickedIntent;", "Lapp/chalo/appmigrationpreconditions/AppMigrationPreconditionsIntent$InitialisationIntent;", "Lapp/chalo/appmigrationpreconditions/AppMigrationPreconditionsIntent$RetryClickedIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class AppMigrationPreconditionsIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/appmigrationpreconditions/AppMigrationPreconditionsIntent$BackClickedIntent;", "Lapp/chalo/appmigrationpreconditions/AppMigrationPreconditionsIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BackClickedIntent extends AppMigrationPreconditionsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BackClickedIntent f955a = new BackClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackClickedIntent);
        }

        public final int hashCode() {
            return -1333706212;
        }

        public final String toString() {
            return "BackClickedIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/appmigrationpreconditions/AppMigrationPreconditionsIntent$InitialisationIntent;", "Lapp/chalo/appmigrationpreconditions/AppMigrationPreconditionsIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitialisationIntent extends AppMigrationPreconditionsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InitialisationIntent f956a = new InitialisationIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof InitialisationIntent);
        }

        public final int hashCode() {
            return -669123677;
        }

        public final String toString() {
            return "InitialisationIntent";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/appmigrationpreconditions/AppMigrationPreconditionsIntent$RetryClickedIntent;", "Lapp/chalo/appmigrationpreconditions/AppMigrationPreconditionsIntent;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RetryClickedIntent extends AppMigrationPreconditionsIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RetryClickedIntent f957a = new RetryClickedIntent();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RetryClickedIntent);
        }

        public final int hashCode() {
            return -178180677;
        }

        public final String toString() {
            return "RetryClickedIntent";
        }
    }
}

package app.chalo.helper;

import android.content.Context;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.home.data.repository.TicketRepository;
import app.chalo.providers.cityprovider.CityProvider;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/helper/KeyStoreToDatabaseMigrationHelperAndroid;", "Lapp/chalo/helper/KeyStoreToDatabaseMigrationHelper;", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class KeyStoreToDatabaseMigrationHelperAndroid implements KeyStoreToDatabaseMigrationHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2838a;
    public final TicketRepository b;
    public final CityProvider c;
    public final CrashlyticsLogger d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004¨\u0006\u000b"}, d2 = {"Lapp/chalo/helper/KeyStoreToDatabaseMigrationHelperAndroid$Companion;", "", "", "LAST_RIDE_STORE_KEY", "Ljava/lang/String;", "KEY_LAST_RIDE_INFO", "BOOKING_ID", "PRODUCT_TYPE", "ACTIVATION_TIME_STAMP", "ACTIVATION_DURATION", "M_TICKET_ACTIVATION_STORE", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public KeyStoreToDatabaseMigrationHelperAndroid(Context context, TicketRepository ticketRepository, CityProvider cityProvider, CrashlyticsLogger crashlyticsLogger) {
        this.f2838a = context;
        this.b = ticketRepository;
        this.c = cityProvider;
        this.d = crashlyticsLogger;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0072 A[Catch: Exception -> 0x0038, TryCatch #0 {Exception -> 0x0038, blocks: (B:14:0x0033, B:31:0x006c, B:33:0x0072, B:38:0x009a, B:43:0x00e2, B:41:0x00bd, B:49:0x00f6, B:21:0x004b, B:22:0x004f, B:28:0x0062, B:30:0x0066, B:25:0x0056), top: B:53:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0092  */
    /* JADX WARN: Code duplicated, block: B:36:0x0093  */
    /* JADX WARN: Code duplicated, block: B:38:0x009a A[Catch: Exception -> 0x0038, TryCatch #0 {Exception -> 0x0038, blocks: (B:14:0x0033, B:31:0x006c, B:33:0x0072, B:38:0x009a, B:43:0x00e2, B:41:0x00bd, B:49:0x00f6, B:21:0x004b, B:22:0x004f, B:28:0x0062, B:30:0x0066, B:25:0x0056), top: B:53:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bd A[Catch: Exception -> 0x0038, TryCatch #0 {Exception -> 0x0038, blocks: (B:14:0x0033, B:31:0x006c, B:33:0x0072, B:38:0x009a, B:43:0x00e2, B:41:0x00bd, B:49:0x00f6, B:21:0x004b, B:22:0x004f, B:28:0x0062, B:30:0x0066, B:25:0x0056), top: B:53:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00e2 A[Catch: Exception -> 0x0038, TryCatch #0 {Exception -> 0x0038, blocks: (B:14:0x0033, B:31:0x006c, B:33:0x0072, B:38:0x009a, B:43:0x00e2, B:41:0x00bd, B:49:0x00f6, B:21:0x004b, B:22:0x004f, B:28:0x0062, B:30:0x0066, B:25:0x0056), top: B:53:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00ef -> B:47:0x00f0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // app.chalo.helper.KeyStoreToDatabaseMigrationHelper
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r20) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.helper.KeyStoreToDatabaseMigrationHelperAndroid.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00c6 A[Catch: Exception -> 0x003c, TryCatch #0 {Exception -> 0x003c, blocks: (B:14:0x0037, B:34:0x00c0, B:31:0x007f, B:33:0x0085, B:47:0x0130, B:36:0x00c6, B:41:0x00f1, B:21:0x005a, B:22:0x0062, B:28:0x0075, B:30:0x0079, B:25:0x0069), top: B:51:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f1 A[Catch: Exception -> 0x003c, TryCatch #0 {Exception -> 0x003c, blocks: (B:14:0x0037, B:34:0x00c0, B:31:0x007f, B:33:0x0085, B:47:0x0130, B:36:0x00c6, B:41:0x00f1, B:21:0x005a, B:22:0x0062, B:28:0x0075, B:30:0x0079, B:25:0x0069), top: B:51:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0127  */
    /* JADX WARN: Code duplicated, block: B:46:0x012e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0085 -> B:34:0x00c0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0127 -> B:45:0x012a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x012e -> B:34:0x00c0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // app.chalo.helper.KeyStoreToDatabaseMigrationHelper
    public final java.lang.Object b(kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.helper.KeyStoreToDatabaseMigrationHelperAndroid.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}

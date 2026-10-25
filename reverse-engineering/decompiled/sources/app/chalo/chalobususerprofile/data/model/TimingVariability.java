package app.chalo.chalobususerprofile.data.model;

import androidx.work.PeriodicWorkRequest;
import com.freshchat.consumer.sdk.beans.config.DefaultRefreshIntervals;
import defpackage.xi1;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\t\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lapp/chalo/chalobususerprofile/data/model/TimingVariability;", "", "time", "", "<init>", "(Ljava/lang/String;IJ)V", "getTime", "()J", "EXACT", "MINUTES_15", "MINUTES_30", "HOUR_1", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public enum TimingVariability {
    EXACT(0),
    MINUTES_15(PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS),
    MINUTES_30(1800000),
    HOUR_1(DefaultRefreshIntervals.REMOTE_CONFIG_FETCH_INTERVAL);

    private final long time;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new xi1(11));

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/chalobususerprofile/data/model/TimingVariability$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/chalobususerprofile/data/model/TimingVariability;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<TimingVariability> serializer() {
            return (KSerializer) TimingVariability.$cachedSerializer$delegate.getValue();
        }
    }

    TimingVariability(long j) {
        this.time = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.b("app.chalo.chalobususerprofile.data.model.TimingVariability", values());
    }

    public static EnumEntries<TimingVariability> getEntries() {
        return $ENTRIES;
    }

    public final long getTime() {
        return this.time;
    }
}

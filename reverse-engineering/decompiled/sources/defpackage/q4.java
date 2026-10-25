package defpackage;

import androidx.compose.foundation.lazy.layout.AndroidPrefetchScheduler;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItemKt;
import androidx.compose.foundation.lazy.layout.PriorityTask;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.text.android.LayoutIntrinsics;
import androidx.constraintlayout.core.utils.GridCore;
import androidx.media3.common.Format;
import androidx.media3.datasource.cache.CacheSpan;
import androidx.media3.datasource.cache.LeastRecentlyUsedCacheEvictor;
import androidx.media3.exoplayer.trackselection.BaseTrackSelection;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.extractor.metadata.mp4.SlowMotionData;
import app.chalo.models.BasicCityInfoAppModel;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import in.juspay.hypersdk.analytics.LogPusherExp;
import java.io.File;
import java.util.Comparator;
import kotlin.Pair;
import org.apache.commons.io.ByteOrderMark;
import org.apache.commons.io.input.BOMInputStream;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q4 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19088a;

    public /* synthetic */ q4(int i) {
        this.f19088a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f19088a) {
            case 0:
                return AndroidPrefetchScheduler.prefetchRequests$lambda$0((PriorityTask) obj, (PriorityTask) obj2);
            case 1:
                return BOMInputStream.lambda$static$0((ByteOrderMark) obj, (ByteOrderMark) obj2);
            case 2:
                return BaseTrackSelection.lambda$new$0((Format) obj, (Format) obj2);
            case 3:
                return ((BasicCityInfoAppModel) obj).b.compareTo(((BasicCityInfoAppModel) obj2).b);
            case 4:
                return ((CityAppModel) obj).f8854a.compareTo(((CityAppModel) obj2).f8854a);
            case 5:
                return CrashlyticsReportPersistence.lambda$static$0((File) obj, (File) obj2);
            case 6:
                return CrashlyticsReportPersistence.oldestEventFileFirst((File) obj, (File) obj2);
            case 7:
                return DefaultTrackSelector.lambda$static$0((Integer) obj, (Integer) obj2);
            case 8:
                return GridCore.lambda$parseSpans$0((String) obj, (String) obj2);
            case 9:
                return LayoutIntrinsics.computeMinIntrinsicWidth$lambda$0((Pair) obj, (Pair) obj2);
            case 10:
                return LayoutNode.ZComparator$lambda$0((LayoutNode) obj, (LayoutNode) obj2);
            case 11:
                return LazyLayoutMeasuredItemKt.LazyLayoutMeasuredItemIndexComparator$lambda$0((LazyLayoutMeasuredItem) obj, (LazyLayoutMeasuredItem) obj2);
            case 12:
                return LeastRecentlyUsedCacheEvictor.compare((CacheSpan) obj, (CacheSpan) obj2);
            case 13:
                return LogPusherExp.lambda$checkFolderLimit$4((File) obj, (File) obj2);
            case 14:
                return SessionReportingCoordinator.lambda$getSortedCustomAttributes$1((CrashlyticsReport.CustomAttribute) obj, (CrashlyticsReport.CustomAttribute) obj2);
            default:
                return SlowMotionData.Segment.lambda$static$0((SlowMotionData.Segment) obj, (SlowMotionData.Segment) obj2);
        }
    }
}

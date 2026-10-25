package app.chalo.livetracking.universalsearch.domain;

import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.builders.SetBuilder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/universalsearch/domain/TransitModeSearchFilter;", "", "NoFilter", "OneOf", "Lapp/chalo/livetracking/universalsearch/domain/TransitModeSearchFilter$NoFilter;", "Lapp/chalo/livetracking/universalsearch/domain/TransitModeSearchFilter$OneOf;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class TransitModeSearchFilter {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/domain/TransitModeSearchFilter$NoFilter;", "Lapp/chalo/livetracking/universalsearch/domain/TransitModeSearchFilter;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NoFilter extends TransitModeSearchFilter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NoFilter f5038a = new NoFilter();

        @Override // app.chalo.livetracking.universalsearch.domain.TransitModeSearchFilter
        public final boolean a(ChaloTransitMode mode) {
            Intrinsics.i(mode, "mode");
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/livetracking/universalsearch/domain/TransitModeSearchFilter$OneOf;", "Lapp/chalo/livetracking/universalsearch/domain/TransitModeSearchFilter;", "Companion", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OneOf extends TransitModeSearchFilter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f5039a;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/domain/TransitModeSearchFilter$OneOf$Companion;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
        }

        public OneOf(SetBuilder setBuilder) {
            this.f5039a = setBuilder;
        }

        @Override // app.chalo.livetracking.universalsearch.domain.TransitModeSearchFilter
        public final boolean a(ChaloTransitMode mode) {
            Intrinsics.i(mode, "mode");
            return this.f5039a.contains(mode);
        }
    }

    public abstract boolean a(ChaloTransitMode chaloTransitMode);
}

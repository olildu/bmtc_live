package app.chalo.livetracking.universalsearch.domain;

import androidx.webkit.Profile;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.universalsearch.data.UniversalSearchFlowSource;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/universalsearch/domain/SearchSourceType;", "", Profile.DEFAULT_PROFILE_NAME, "Ondc", "Lapp/chalo/livetracking/universalsearch/domain/SearchSourceType$Default;", "Lapp/chalo/livetracking/universalsearch/domain/SearchSourceType$Ondc;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SearchSourceType {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5037a;
    public final UniversalSearchFlowSource b;
    public final Set c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/domain/SearchSourceType$Default;", "Lapp/chalo/livetracking/universalsearch/domain/SearchSourceType;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Default extends SearchSourceType {
        public final String d;
        public final UniversalSearchFlowSource e;
        public final Set f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Default(String query, UniversalSearchFlowSource source, Set set) {
            super(query, source, set);
            Intrinsics.i(query, "query");
            Intrinsics.i(source, "source");
            this.d = query;
            this.e = source;
            this.f = set;
        }

        @Override // app.chalo.livetracking.universalsearch.domain.SearchSourceType
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF5037a() {
            return this.d;
        }

        @Override // app.chalo.livetracking.universalsearch.domain.SearchSourceType
        /* JADX INFO: renamed from: b, reason: from getter */
        public final Set getC() {
            return this.f;
        }

        @Override // app.chalo.livetracking.universalsearch.domain.SearchSourceType
        /* JADX INFO: renamed from: c, reason: from getter */
        public final UniversalSearchFlowSource getB() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Default)) {
                return false;
            }
            Default r5 = (Default) obj;
            return Intrinsics.d(this.d, r5.d) && this.e == r5.e && Intrinsics.d(this.f, r5.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + ((this.e.hashCode() + (this.d.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "Default(query=" + this.d + ", source=" + this.e + ", searchFilters=" + this.f + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/domain/SearchSourceType$Ondc;", "Lapp/chalo/livetracking/universalsearch/domain/SearchSourceType;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Ondc extends SearchSourceType {
        public final String d;
        public final UniversalSearchFlowSource e;
        public final Set f;
        public final ChaloTransitMode g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ondc(String query, UniversalSearchFlowSource source, Set set, ChaloTransitMode mode) {
            super(query, source, set);
            Intrinsics.i(query, "query");
            Intrinsics.i(source, "source");
            Intrinsics.i(mode, "mode");
            this.d = query;
            this.e = source;
            this.f = set;
            this.g = mode;
        }

        @Override // app.chalo.livetracking.universalsearch.domain.SearchSourceType
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF5037a() {
            return this.d;
        }

        @Override // app.chalo.livetracking.universalsearch.domain.SearchSourceType
        /* JADX INFO: renamed from: b, reason: from getter */
        public final Set getC() {
            return this.f;
        }

        @Override // app.chalo.livetracking.universalsearch.domain.SearchSourceType
        /* JADX INFO: renamed from: c, reason: from getter */
        public final UniversalSearchFlowSource getB() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Ondc)) {
                return false;
            }
            Ondc ondc = (Ondc) obj;
            return Intrinsics.d(this.d, ondc.d) && this.e == ondc.e && Intrinsics.d(this.f, ondc.f) && this.g == ondc.g;
        }

        public final int hashCode() {
            return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + (this.d.hashCode() * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "Ondc(query=" + this.d + ", source=" + this.e + ", searchFilters=" + this.f + ", mode=" + this.g + ")";
        }
    }

    public SearchSourceType(String str, UniversalSearchFlowSource universalSearchFlowSource, Set set) {
        this.f5037a = str;
        this.b = universalSearchFlowSource;
        this.c = set;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public String getF5037a() {
        return this.f5037a;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public Set getC() {
        return this.c;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public UniversalSearchFlowSource getB() {
        return this.b;
    }
}

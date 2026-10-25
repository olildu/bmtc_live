package defpackage;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Player;
import androidx.media3.common.SimpleBasePlayer;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.ui.TrackSelectionDialogBuilder;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.util.HashSet;
import java.util.Map;
import so.plotline.insights.FlowViews.WidgetReloadCallback;
import so.plotline.insights.Helpers.DebugHelper;
import so.plotline.insights.Listeners.PlotlineWidgetChangeListener;
import so.plotline.insights.PlotlineWidget;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ts0 implements PlotlineWidgetChangeListener, AccessibilityViewCommand, ListenerSet.Event, TrackSelectionDialogBuilder.DialogCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19686a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ts0(Object obj, int i, int i2) {
        this.f19686a = i2;
        this.c = obj;
        this.b = i;
    }

    @Override // so.plotline.insights.Listeners.PlotlineWidgetChangeListener
    public void a(boolean z) {
        PlotlineWidget plotlineWidget = (PlotlineWidget) this.c;
        int i = this.b;
        HashSet hashSet = PlotlineWidget.p;
        try {
            if (!z) {
                plotlineWidget.k(i);
                return;
            }
            WidgetReloadCallback widgetReloadCallback = plotlineWidget.g;
            if (widgetReloadCallback != null) {
                widgetReloadCallback.a();
            } else {
                plotlineWidget.i(Boolean.FALSE);
            }
        } catch (Exception e) {
            DebugHelper.a(e);
        }
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        switch (this.f19686a) {
            case 2:
                ((Player.Listener) obj).onMediaItemTransition((MediaItem) this.c, this.b);
                break;
            default:
                SimpleBasePlayer.lambda$updateStateAndInformListeners$32((SimpleBasePlayer.State) this.c, this.b, (Player.Listener) obj);
                break;
        }
    }

    @Override // androidx.media3.ui.TrackSelectionDialogBuilder.DialogCallback
    public void onTracksSelected(boolean z, Map map) {
        TrackSelectionDialogBuilder.lambda$new$0((Player) this.c, this.b, z, map);
    }

    @Override // androidx.core.view.accessibility.AccessibilityViewCommand
    public boolean perform(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
        SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.c;
        int i = SideSheetBehavior.x;
        sideSheetBehavior.f(this.b);
        return true;
    }
}

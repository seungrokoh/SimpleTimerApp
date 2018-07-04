package example.develop.davidoh.simpletimerapp

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import example.develop.davidoh.simpletimerapp.util.NotificationUtil
import example.develop.davidoh.simpletimerapp.util.PrefUtil

class TimerExpiredReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        NotificationUtil.showTimerExpired(context)

        PrefUtil.setTimerState(TimerActivity.TimerState.Stopped, context)
        PrefUtil.setAlarmSetTime(0, context)

    }
}
